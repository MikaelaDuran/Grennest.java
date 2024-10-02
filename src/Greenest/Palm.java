package Greenest;

public class Palm extends Vaxt {
    //Subklass

    //Undviker hårdkodning
    private static final double mangdKranvatten = 0.5;

    public Palm(String namn, double hojd) {
        super(namn, hojd);
    }

    //Tom konstruktor
    public Palm() {
        super();
    }

    // Metoder från Interface
    @Override
    public double vatskeBehov() {
        return mangdKranvatten * getHojd();
    }

    @Override
    public String vatskeKategori() {
        return Naringsvatska.KRANVATTEN.getNaring();
    }

}
