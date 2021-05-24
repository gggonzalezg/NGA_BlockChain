package clinica.abc.blockchain.utils;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class HistoriaClinica_sol_HistoriaClinica extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50600080546001600160a01b03191633179055610582806100326000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c806306fdde03146100515780633f9b250a1461006f578063697c58d7146100905780638da5cb5b146100a5575b600080fd5b6100596100d0565b60405161006691906104bf565b60405180910390f35b61008261007d36600461039e565b61015e565b6040516100669291906104d9565b6100a361009e3660046103b6565b610238565b005b6000546100b8906001600160a01b031681565b6040516001600160a01b039091168152602001610066565b600180546100dd906104fb565b80601f0160208091040260200160405190810160405280929190818152602001828054610109906104fb565b80156101565780601f1061012b57610100808354040283529160200191610156565b820191906000526020600020905b81548152906001019060200180831161013957829003601f168201915b505050505081565b606060008060026000858152602001908152602001600020604051806060016040529081600082018054610191906104fb565b80601f01602080910402602001604051908101604052809291908181526020018280546101bd906104fb565b801561020a5780601f106101df5761010080835404028352916020019161020a565b820191906000526020600020905b8154815290600101906020018083116101ed57829003601f168201915b5050509183525050600182015460208201526002909101546040918201528151910151909590945092505050565b6000546001600160a01b031633146102ac5760405162461bcd60e51b815260206004820152602d60248201527f596f7520617265206e6f7420617574686f72697a65642c20796f75206d75737460448201526c103132903a34329037bbb732b960991b606482015260840160405180910390fd5b6040805160608101825283815260208082018690528183018490526000868152600282529290922081518051929391926102e99284920190610305565b5060208201516001820155604090910151600290910155505050565b828054610311906104fb565b90600052602060002090601f0160209004810192826103335760008555610379565b82601f1061034c57805160ff1916838001178555610379565b82800160010185558215610379579182015b8281111561037957825182559160200191906001019061035e565b50610385929150610389565b5090565b5b80821115610385576000815560010161038a565b6000602082840312156103af578081fd5b5035919050565b6000806000606084860312156103ca578182fd5b83359250602084013567ffffffffffffffff808211156103e8578384fd5b818601915086601f8301126103fb578384fd5b81358181111561040d5761040d610536565b604051601f8201601f19908116603f0116810190838211818310171561043557610435610536565b8160405282815289602084870101111561044d578687fd5b82602086016020830137918201602001959095529497949650505050604092909201359150565b60008151808452815b818110156104995760208185018101518683018201520161047d565b818111156104aa5782602083870101525b50601f01601f19169290920160200192915050565b6020815260006104d26020830184610474565b9392505050565b6040815260006104ec6040830185610474565b90508260208301529392505050565b600181811c9082168061050f57607f821691505b6020821081141561053057634e487b7160e01b600052602260045260246000fd5b50919050565b634e487b7160e01b600052604160045260246000fdfea2646970667358221220f5f6b9f53c92f1887118d4056cf5a1785f54b81b5ee78981c7755120ea18193064736f6c63430008040033";

    public static final String FUNC_ADDDOCUMENT = "addDocument";

    public static final String FUNC_GETDOCUMENT = "getDocument";

    public static final String FUNC_NAME = "name";

    public static final String FUNC_OWNER = "owner";

    @Deprecated
    protected HistoriaClinica_sol_HistoriaClinica(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected HistoriaClinica_sol_HistoriaClinica(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected HistoriaClinica_sol_HistoriaClinica(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected HistoriaClinica_sol_HistoriaClinica(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> addDocument(BigInteger _id, String _hashedDoc, BigInteger _timestamp) {
        final Function function = new Function(
                FUNC_ADDDOCUMENT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.Utf8String(_hashedDoc), 
                new org.web3j.abi.datatypes.generated.Uint256(_timestamp)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Tuple2<String, BigInteger>> getDocument(BigInteger _id) {
        final Function function = new Function(FUNC_GETDOCUMENT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple2<String, BigInteger>>(function,
                new Callable<Tuple2<String, BigInteger>>() {
                    @Override
                    public Tuple2<String, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<String, BigInteger>(
                                (String) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<String> name() {
        final Function function = new Function(FUNC_NAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> owner() {
        final Function function = new Function(FUNC_OWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    @Deprecated
    public static HistoriaClinica_sol_HistoriaClinica load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new HistoriaClinica_sol_HistoriaClinica(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static HistoriaClinica_sol_HistoriaClinica load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new HistoriaClinica_sol_HistoriaClinica(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static HistoriaClinica_sol_HistoriaClinica load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new HistoriaClinica_sol_HistoriaClinica(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static HistoriaClinica_sol_HistoriaClinica load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new HistoriaClinica_sol_HistoriaClinica(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<HistoriaClinica_sol_HistoriaClinica> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(HistoriaClinica_sol_HistoriaClinica.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<HistoriaClinica_sol_HistoriaClinica> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(HistoriaClinica_sol_HistoriaClinica.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<HistoriaClinica_sol_HistoriaClinica> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(HistoriaClinica_sol_HistoriaClinica.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<HistoriaClinica_sol_HistoriaClinica> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(HistoriaClinica_sol_HistoriaClinica.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
