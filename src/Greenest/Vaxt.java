package Greenest;

public abstract class Vaxt implements IVatska {

    //Superklassen.
    //Subklaserna Palm, Kaktus och KottatandeVäxt ärver från superklassen Vaxt

    //INKAPSLING. Instansvariabler
    private String namn;
    private double hojd; //i meter.


    //Konstruktor
    public Vaxt(String namn, double hojdMeter) {
        this.namn = namn;
        this.hojd = hojdMeter;
    }

    //Tom konstruktor
    public Vaxt() {

    }

    // Getter och setters pga inkapsling
        public String getNamn() {
            return namn;
        }

        public double getHojd() {
            return hojd;
        }

        public void setNamn(String namn) {
        this.namn = namn;
    }

        public void setHojd(double hojd) {
            this.hojd = hojd;
        }
}
