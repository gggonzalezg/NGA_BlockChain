package clinica.abc.blockchain.model;

public class Result {
    private String _id;
    private String description;

    public Result() {
    }

    public Result(String _id, String description) {
        this._id = _id;
        this.description = description;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{\"Result\":{"
                + "\"_id\":\"" + _id + "\""
                + ", \"description\":\"" + description + "\""
                + "}}";
    }
}
