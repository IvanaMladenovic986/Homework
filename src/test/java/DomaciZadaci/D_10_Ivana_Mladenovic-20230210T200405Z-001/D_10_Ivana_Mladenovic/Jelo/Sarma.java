package DomaciZadaci.D_10_1;

import java.util.ArrayList;

public class Sarma extends Jelo {
    public Sarma(String naziv, ArrayList<String> listaSastojaka, boolean bezLaktoze) {
        super(naziv, listaSastojaka, bezLaktoze);

        for (int i = 0; i < listaSastojaka.size(); i++) {
            if (listaSastojaka.get(i).equals("mleko")) {
                bezLaktoze = true;
                System.out.println("Jelo sadrzi laktozu");
            } else {
                bezLaktoze = false;
                System.out.println("Jelo ne sadrzi laktozu");
            }
        }
    }
}

