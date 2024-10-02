package Greenest;

public class KottatandeVaxt extends Vaxt {
    //Subklass

    //Undviker hårdkodning
    private static final double basMangdProteinDryck= 0.1;
    private static final double extraTillskottPerMeter= 0.2;

    //Konstruktor
    public KottatandeVaxt(String namn, double hojd) {
        super(namn, hojd);
    }

    //Tom konstruktor
    public KottatandeVaxt(){
        
    }

    //Metoder från Interface
    @Override
    public double vatskeBehov() {
        return basMangdProteinDryck + (extraTillskottPerMeter * getHojd()); //0,1 per dag + extratillskott 0,2 gånger höjden
    }

    @Override
    public String vatskeKategori() {
        return Naringsvatska.PROTEINDRYCK.getNaring();
    }
}
