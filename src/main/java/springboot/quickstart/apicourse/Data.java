package springboot.quickstart.apicourse;


public class Data {

    //private MessType messType;
    private Object typeMess;
    private Object timestamp;
    private Object origin;
    private Object destination;
    private Object duration;
    private String statCode;
    private String statDescription;
    private String messContent;
    private String messStatus;


    public Data(Object typeMess, Object timestamp, Object origin, Object destination, Object duration, String statCode, String statDescription, String messContent, String messStatus) {
        this.typeMess = typeMess;
        this.timestamp = timestamp;
        this.origin = origin;
        this.destination = destination;
        this.duration = duration;
        this.statCode = statCode;
        this.statDescription = statDescription;
        this.messContent = messContent;
        this.messStatus = messStatus;
    }

    public Data() {

    }

    public Object getTypeMess() {
        return typeMess;
    }

    public void setTypeMess(Object typeMess) {
        this.typeMess = typeMess;
    }

/*
    public MessType getMessType() {
        return messType;
    }

    public void setMessType(MessType messType) {
        this.messType = messType;
    }
*/
    public Object getTimestamp() {
        return  timestamp;
    }

    public void setTimestamp(Object timestamp) {
        this.timestamp = timestamp;
    }

    public Object getOrigin() {
        return origin;
    }

    public void setOrigin(Object origin) {
        this.origin = origin;
    }

    public Object getDestination() {
        return destination;
    }

    public void setDestination(Object destination) {
        this.destination = destination;
    }

    public Object getDuration() {
        return duration;
    }

    public void setDuration(Object duration) {
        this.duration = duration;
    }

    public String getStatCode() {
        return statCode;
    }

    public void setStatCode(String statCode) {
        this.statCode = statCode;
    }

    public String getStatDescription(String statDescription) {
        return this.statDescription;
    }

    public void setStatDescription(String statDescription) {
        this.statDescription = statDescription;
    }

    public String getMessContent(String messContent) {
        return this.messContent;
    }

    public void setMessContent(String messContent) {
        this.messContent = messContent;
    }

    public String getMessStatus(String messStatus) {
        return this.messStatus;
    }

    public void setMessStatus(String messStatus) {
        this.messStatus = messStatus;
    }


}
