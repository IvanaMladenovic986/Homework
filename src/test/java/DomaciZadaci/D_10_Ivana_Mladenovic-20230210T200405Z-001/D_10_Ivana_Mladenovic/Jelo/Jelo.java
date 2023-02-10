package DomaciZadaci.D_10_1;

import java.util.ArrayList;

public class Jelo {
    String naziv;
    ArrayList<String> listaSastojaka;

    boolean bezLaktoze;

    public Jelo(String naziv, ArrayList<String> listaSastojaka, boolean bezLaktoze) {
        this.naziv = naziv;
        this.listaSastojaka = new ArrayList<>(listaSastojaka);
        this.bezLaktoze = bezLaktoze;
    }

    public void stampa(){
        System.out.println(" Jelo " + naziv + " sadrzi sastojke " + this.listaSastojaka + ".");

        if (bezLaktoze){
            System.out.println("Jelo ne sadrzi laktozu.");
        }
        else {
            System.out.println("Jelo sadrzi laktozu.");
        }
    }
}
