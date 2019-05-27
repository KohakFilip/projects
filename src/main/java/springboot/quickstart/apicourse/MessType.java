package springboot.quickstart.apicourse;

public enum MessType {

    CALL("CALL"),
    MSG("MSG");

    String name;

    MessType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



}


