package clinica.abc.blockchain.model;

public class Actions {
    private String data;

    public Actions() {
    }

    public Actions(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{\"Actions\":{"
                + "\"data\":\"" + data + "\""
                + "}}";
    }
}
