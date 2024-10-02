package Greenest;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public Main() {

        //Polymorfism
        Vaxt v1 = new Kaktus("Igge", 0.2); //20cm
        Vaxt v2 = new Palm("Laura", 5);
        Vaxt v3 = new KottatandeVaxt("Meetloaf", 0.7);
        Vaxt v4 = new Palm("Olof", 1);


        List<Vaxt> lista = new ArrayList<>();
        lista = Arrays.asList(v1, v2, v3, v4);

        while(true) {
            String input = JOptionPane.showInputDialog("Vilken växt ska få vätska?\nSkriv avsluta för att stänga programmet");

            //Om man klickar på Cancel eller skriver avsluta
            if(input == null|| input.equalsIgnoreCase("avsluta")) {
                JOptionPane.showMessageDialog(null,"Programmet avslutas");
                break;
            }

            boolean hittad = false;

            for(Vaxt vaxt : lista) {
                if (vaxt.getNamn().equalsIgnoreCase(input)) {
                    JOptionPane.showMessageDialog(null, vaxt.getNamn() + " ska få " + vaxt.vatskeBehov() +
                            " liter " + vaxt.vatskeKategori());
                    hittad = true;

                }
            }
            if(!hittad) {
                JOptionPane.showMessageDialog(null,"Växten hittas inte på Greenest Hotell. Försök igen.");
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

    }
}