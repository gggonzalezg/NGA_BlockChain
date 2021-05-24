package clinica.abc.blockchain.model;

public class Procedimiento {
    private String _id;
    private String userId;
    private String date;
    private String procedureId;
    private String medicalHeadquarterId;
    private String professionalId;
    private Result result;
    private Actions actions;

    public Procedimiento() {
    }

    public Procedimiento(String _id, String userId, String date, String procedureId, String medicalHeadquarterId, String professionalId, Result result, Actions actions) {
        this._id = _id;
        this.userId = userId;
        this.date = date;
        this.procedureId = procedureId;
        this.medicalHeadquarterId = medicalHeadquarterId;
        this.professionalId = professionalId;
        this.result = result;
        this.actions = actions;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(String procedureId) {
        this.procedureId = procedureId;
    }

    public String getMedicalHeadquarterId() {
        return medicalHeadquarterId;
    }

    public void setMedicalHeadquarterId(String medicalHeadquarterId) {
        this.medicalHeadquarterId = medicalHeadquarterId;
    }

    public String getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(String professionalId) {
        this.professionalId = professionalId;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Actions getActions() {
        return actions;
    }

    public void setActions(Actions actions) {
        this.actions = actions;
    }

    @Override
    public String toString() {
        return "{\"Procedimiento\":{"
                + "\"_id\":\"" + _id + "\""
                + ", \"userId\":\"" + userId + "\""
                + ", \"date\":\"" + date + "\""
                + ", \"procedureId\":\"" + procedureId + "\""
                + ", \"medicalHeadquarterId\":\"" + medicalHeadquarterId + "\""
                + ", \"professionalId\":\"" + professionalId + "\""
                + ", \"result\":" + result
                + ", \"actions\":" + actions
                + "}}";
    }


}
