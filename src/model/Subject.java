public class Subject {
    
    private String code;
    private String name;
    private String version;
    private String structDescr;
    private int recTime;
    private String duration;
    private String totalDuration;
    private String type;
    private boolean status;

    public Subject(String code, String name, String version, String structDescr, int recTime, String duration, String totalDuration, String type, boolean status) {
        this.code = code;
        this.name = name;
        this.version = version;
        this.structDescr = structDescr;
        this.recTime = recTime;
        this.duration = duration;
        this.totalDuration = totalDuration;
        this.type = type;
        this.status = status;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getStructDescr() {
        return this.structDescr;
    }

    public void setStructDescr(String structDescr) {
        this.structDescr = structDescr;
    }

    public int getRecTime() {
        return this.recTime;
    }

    public void setRecTime(int recTime) {
        this.recTime = recTime;
    }

    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTotalDuration() {
        return this.totalDuration;
    }

    public void setTotalDuration(String totalDuration) {
        this.totalDuration = totalDuration;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
