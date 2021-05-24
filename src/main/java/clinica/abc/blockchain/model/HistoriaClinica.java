package clinica.abc.blockchain.model;


public class HistoriaClinica {
    public String hash;
    public int id;
    public int timestamp;

    public HistoriaClinica(String hash, int id, int timestamp) {
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

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
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
