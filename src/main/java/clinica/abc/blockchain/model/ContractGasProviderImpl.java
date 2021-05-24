package clinica.abc.blockchain.model;

import org.web3j.tx.gas.ContractGasProvider;

import java.math.BigInteger;

public class ContractGasProviderImpl implements ContractGasProvider {
    BigInteger GAS_LIMIT = BigInteger.valueOf(6721975);//BigInteger.valueOf(9_000_000);
    BigInteger GAS_PRICE = BigInteger.valueOf(20000000000L);//BigInteger.valueOf(4_100_000_000L);

    @Override
    public BigInteger getGasPrice(String s) {
        return this.GAS_PRICE;
    }

    @Override
    public BigInteger getGasPrice() {
        return this.GAS_PRICE;
    }

    @Override
    public BigInteger getGasLimit(String s) {
        return this.GAS_LIMIT;
    }

    @Override
    public BigInteger getGasLimit() {
        return this.GAS_LIMIT;
    }
}
