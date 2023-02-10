package DomaciZadaci.D_10_1;

        /*Napraviti klasu Jelo, koje ce imati atribute za naziv, listu sastojaka i boolean vrednost bezLaktoze.
        Klase Corba, Torta i Sarma nasledjuju klasu Jelo. Ukoliko je jedan od sastojaka mleko,
        podesicemo boolean vrednost za laktozu na false,
        u suprotnom na true. U main klasi kreirati i istampati bar tri jela (njihov naziv, sastojke i da li lactose-free).*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaSastojaka = new ArrayList<>();

        Jelo corba = new Jelo("corba",  listaSastojaka, true);
        Jelo sarma = new Jelo("sarma",listaSastojaka, true);
        Jelo torta = new Jelo("torta", listaSastojaka, false);

        Corba corba1 = new Corba("corba", listaSastojaka, true);
                corba1.listaSastojaka.add("krompir");
                corba1.listaSastojaka.add("meso");
                corba1.listaSastojaka.add("luk");
                corba1.stampa();

        Sarma sarma1 = new Sarma("sarma", listaSastojaka, true);
              sarma1.listaSastojaka.add("kupus");
              sarma1.listaSastojaka.add("meso");
              sarma1.listaSastojaka.add("pirinac");
              sarma1.stampa();

         Torta torta1 = new Torta("torta", listaSastojaka, false);
               torta1.listaSastojaka.add("cokolada");
               torta1.listaSastojaka.add("mleko");
               torta1.listaSastojaka.add("keks");
               torta1.stampa();
    }
}
