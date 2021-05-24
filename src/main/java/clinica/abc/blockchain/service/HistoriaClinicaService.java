package clinica.abc.blockchain.service;

import clinica.abc.blockchain.model.*;
import clinica.abc.blockchain.utils.HistoriaClinica_sol_HistoriaClinica;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tuples.generated.Tuple2;

import javax.xml.bind.DatatypeConverter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Logger;

@Service
public class HistoriaClinicaService {

    private final Logger log = Logger.getLogger(HistoriaClinicaService.class.getName());

    private final Web3j web3j = Web3j.build(new HttpService("http://127.0.0.1:7545"));
    private final Credentials creds = Credentials.
            create("fb658828492e0489a0f0da1bcd6c87af4bd5e0897104abf12324f0f610effec6");
    private final ContractGasProviderImpl gasProvider = new ContractGasProviderImpl();
    private final String address = "0x8fAB1603e4aC958cb3357ea2749D89313abDA1A9";
    private final HistoriaClinica_sol_HistoriaClinica hcsc =
            HistoriaClinica_sol_HistoriaClinica.load(address, web3j, creds, gasProvider);

    public Health health() {
        try {
            List<String> accouts = web3j.ethAccounts().sendAsync().get().getAccounts();
            String owner = accouts.get(0);
            BigInteger balance = web3j.ethGetBalance(owner, DefaultBlockParameterName.LATEST).send().getBalance();
            String txs = web3j.ethGetTransactionCount(owner, DefaultBlockParameter.valueOf("latest")).sendAsync().get().getResult();
            return new Health(accouts, owner, balance, txs);
        } catch (Exception e) {
            e.printStackTrace();
            return new Health();
        }
    }

    public TransactionReceipt registrarProcedimiento(Procedimiento procedimiento) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(procedimiento.toString().getBytes());
            byte[] digest = md.digest();
            HistoriaClinica hc = new HistoriaClinica(DatatypeConverter.printHexBinary(digest).toUpperCase(),
                    Integer.parseInt(procedimiento.get_id()),
                    System.currentTimeMillis());
            log.info(hc.toString());
            return addDocument(hc);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return new TransactionReceipt();
        }
    }

    public TransactionReceipt addDocument(HistoriaClinica hc) {
        try {
            TransactionReceipt receipt = hcsc.addDocument(
                    BigInteger.valueOf(hc.getId()), hc.getHash(), BigInteger.valueOf(hc.getTimestamp())).send();
            log.info(receipt.isStatusOK() + "\n" + receipt.getBlockHash());
            return receipt;
        } catch (Exception e) {
            e.printStackTrace();
            return new TransactionReceipt();
        }
    }

    public Tuple2<String, BigInteger> getDocument(BigInteger id) {
        try {
            Tuple2<String, BigInteger> result = hcsc.getDocument(id).send();
            log.info(result.component1() + "\n" + result.component2());
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
