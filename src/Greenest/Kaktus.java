package Greenest;

public class Kaktus extends Vaxt {
    //Subklass

    //Undviker hårdkodning
    private static final double mangdMineralvatten = 0.02;

    //Konstruktor
    public Kaktus(String namn, double hojd) {
        super(namn, hojd);
    }

    //Tom konstruktor
    public Kaktus() {

    }
    //Metod från Interface
    @Override
    public double vatskeBehov() {
        return mangdMineralvatten; // Alltid 2cl oavsett höjd
    }


    @Override
    public String vatskeKategori() {
        return Naringsvatska.MINERALVATTEN.getNaring();
    }


}
