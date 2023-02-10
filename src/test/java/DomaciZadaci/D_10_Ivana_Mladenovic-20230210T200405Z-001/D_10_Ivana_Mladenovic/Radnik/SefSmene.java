package DomaciZadaci.D_10;

public class SefSmene extends Radnik{
    public SefSmene(int id, String nazivRadnika, int godineIskustva, int plata) {
        super(id, nazivRadnika, godineIskustva, plata);


        if(godineIskustva>5){
            plata = plata*20/100;
        }
        else {
            plata=plata;
        }
    }
}



