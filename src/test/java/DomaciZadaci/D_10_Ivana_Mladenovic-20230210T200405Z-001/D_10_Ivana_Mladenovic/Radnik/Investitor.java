package DomaciZadaci.D_10;

public class Investitor extends Radnik{
    int brojZgrada;

    public Investitor(int id, String nazivRadnika, int godineIskustva, int plata, int brojZgrada) {
        super(id, nazivRadnika, godineIskustva, plata);
        this.brojZgrada = brojZgrada;

        if (brojZgrada>5) {
            plata = plata*30/100;
        }
        else {
           plata = plata;
        }
    }
}
