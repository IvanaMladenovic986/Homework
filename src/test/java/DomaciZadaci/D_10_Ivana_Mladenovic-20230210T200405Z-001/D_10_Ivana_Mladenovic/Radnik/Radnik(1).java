package DomaciZadaci.D_10;

public class Radnik {
    int id;
    String nazivRadnika;
    int godineIskustva;
    int plata;

    public Radnik(int id, String nazivRadnika, int godineIskustva, int plata) {
        this.id = id;
        this.nazivRadnika = nazivRadnika;
        this.godineIskustva = godineIskustva;
        this.plata = plata;
    }
    public void stampa (){
        System.out.println("Radnik na poziciji " + this.nazivRadnika + " ima id broj " + this.id + " i " + this.godineIskustva + " godina iskustva i zaradu " + plata + ".");
    }




}
