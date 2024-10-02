package Greenest;

public enum Naringsvatska {

    //ENUM
    KRANVATTEN ("kranvatten"),
    MINERALVATTEN ("mineralvatten"),
    PROTEINDRYCK ("proteindryck");

    private final String naring;

    Naringsvatska(String v){
        naring = v;
    }

    //pga INKAPSLING
    public String getNaring(){
        return naring;
    }
}
