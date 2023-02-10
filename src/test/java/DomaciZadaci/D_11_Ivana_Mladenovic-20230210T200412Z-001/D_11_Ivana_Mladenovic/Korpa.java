package DomaciZadaci.D_11;

import java.util.ArrayList;

    public class Korpa {
        ArrayList<Namirnica> listaNamirnica;

        public Korpa() {
            this.listaNamirnica = new ArrayList<>();
        }

        public void dodavanjeNamirnica(Namirnica namirnica) {
            listaNamirnica.add(namirnica);
        }

        public int suma() {
            int suma = 0;
            for (int i = 0; i < listaNamirnica.size(); i++) {
                suma = suma + listaNamirnica.get(i).getCena();
            }
            return suma;
        }

        public void stampa() {
            System.out.println("Namirnice u korpi su: ");
            for (int i = 0; i < listaNamirnica.size(); i++) {
                System.out.println(listaNamirnica.get(i).getNaziv());
            }
            System.out.println("Ukupna cena paste je " + suma() + ".");
        }

        public boolean nalaziSE(Namirnica namirnica, ArrayList listaNamirnica) {
            boolean exist = false;
            for (int i = 0; i < listaNamirnica.size(); i++) {
                if (listaNamirnica.get(i).equals(namirnica)) {
                    exist = true;
                    break;
                }
            } return true;
        }
    }

























