package DomaciZadaci.D_10;

        /*Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata.
        Klase Fizikalac, SefSmene i Investitor nasledjuju klasu Radnik. Investitor ce
        imati dodatno polje za broj zgrada koje je do sada digao. Istampati njihove podatke
        sa tim da racunamo 20% vecu platu sefu smene
        i fizikalcu ako imaju vise od 5 godina iskustva i 30% vecu platu investitoru ako je digao bar 5 zgrada.*/

public class Main {
    public static void main(String[] args) {

        Radnik investitor = new Radnik(12, "investitor", 10, 70000);
        Radnik  sefSmene = new Radnik(15, "sefSmene", 7, 50000);
        Radnik fizikalac = new Radnik(23, "fizikalac", 3, 45000);

        Investitor investitor1 = new Investitor(investitor.id, investitor.nazivRadnika, investitor.godineIskustva, investitor.plata, 7);
        SefSmene sefSmene1 = new SefSmene(sefSmene.id, sefSmene.nazivRadnika, sefSmene.godineIskustva, sefSmene.plata);
        Fizikalac fizikalac1 = new Fizikalac(fizikalac.id, fizikalac.nazivRadnika, fizikalac.godineIskustva, fizikalac.plata);

        investitor1.stampa();
        sefSmene1.stampa();
        fizikalac1.stampa();

        if(sefSmene1.godineIskustva>5){
            sefSmene1.plata = sefSmene1.plata*120/100;
        }
        else {
            sefSmene1.plata = sefSmene1.plata;
        }
        sefSmene1.stampa();

        if (fizikalac1.godineIskustva>5){
            fizikalac1.plata = fizikalac1.plata*120/100;
        }
        else {
            fizikalac1.plata=fizikalac1.plata;
        }

        if (investitor1.brojZgrada>=5){
            investitor1.plata= investitor1.plata*130/100;
        }
        else {
            investitor1.plata= investitor.plata;
        }
        investitor1.stampa();
    }

}


