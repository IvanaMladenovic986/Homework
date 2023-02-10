package DomaciZadaci.D_09_1;

public class Main {
    public static void main(String[] args) {
        Radnik radnik1 = new Radnik();
        radnik1.ime ="Nikola";
        radnik1.pozicija = "saradnik";
        radnik1.plata = 50000;

        Radnik radnik2 = new Radnik();
        radnik2.ime = "Petar";
        radnik2.pozicija = "pomocnik";
        radnik2.plata = 75000;

        if (radnik1.plata > radnik2.plata) {
            radnik1.plata = radnik1.plata * 120/100;
            System.out.println(radnik1.ime + " je zaposlen na poziciji " + radnik1.pozicija +
                    " i njegova plata, uvecana za 20%, je " + radnik1.plata + ".");
        } else if (radnik2.plata> radnik1.plata) {
            radnik2.plata = radnik2.plata * 120/100;
            System.out.println(radnik2.ime + " je zaposlen na poziciji " + radnik2.pozicija +
                    " i njegova plata, uvecana za 20%, je " + radnik2.plata + ".");
        }
        else {
            System.out.println("Plate su jednake.");
        }
    }
}
