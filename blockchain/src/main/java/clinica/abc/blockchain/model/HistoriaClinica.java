package clinica.abc.blockchain.model;


public class HistoriaClinica {
    private String hash;
    private int id;
    private long timestamp;

    public HistoriaClinica() {
    }

    public HistoriaClinica(String hash, int id, long timestamp) {
        this.hash = hash;
        this.id = id;
        this.timestamp = timestamp;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "{\"HistoriaClinica\":{"
                + "\"hash\":\"" + hash + "\""
                + ", \"id\":\"" + id + "\""
                + ", \"timestamp\":\"" + timestamp + "\""
                + "}}";
    }
}
