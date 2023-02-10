package DomaciZadaci.D_11;
/*Napraviti klasu Namirnica. Ona ima atribute za naziv i cenu. Dodati konstuktor i get metode za ovu klasu.
Zatim napraviti klasu Korpa. Unutar korpe imamo listu namirnica.
Osim konstuktora definisati:
- metoda int suma(ArrayList<Namirnica> lista) - vraca ukupnu cenu svih namirnica iz korpe.
- metoda boolean nalaziSe(Namirnica n) - vraca true ukoliko se neka namirnica nalazi u korpi.
- metoda stampaj() - istampace sve namirnice iz liste.
U glavnoj klasi napraviti listu namirnica koju cete proslediti konstruktoru klase Korpa.*/

public class Main {

    public static void main(String[] args) {

        Namirnica namirnica1 = new Namirnica("jabuka", 50);
        Namirnica namirnica2 = new Namirnica("keks", 100);
        Namirnica namirnica3 = new Namirnica("jaja", 200);
        Namirnica namirnica4 = new Namirnica("mleko", 150);
        Namirnica namirnica5 = new Namirnica("hleb", 70);


        Korpa korpa1 = new Korpa();
        korpa1.dodavanjeNamirnica(namirnica1);
        korpa1.dodavanjeNamirnica(namirnica2);
        korpa1.dodavanjeNamirnica(namirnica5);
        korpa1.dodavanjeNamirnica(namirnica3);
        korpa1.stampa();

    }
}

