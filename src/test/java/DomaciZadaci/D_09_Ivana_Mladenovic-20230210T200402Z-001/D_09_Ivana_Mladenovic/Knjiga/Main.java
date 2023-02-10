package DomaciZadaci.D_09;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Knjiga knjiga1 = new Knjiga();
        knjiga1.naziv = "Kraljevstvo";
        knjiga1.zanr = "triler";
        Knjiga knjiga2 = new Knjiga();
        knjiga2.naziv = "Napustanje";
        knjiga2.zanr = "drama";

        if (knjiga1.naziv.equals(knjiga2.naziv) && knjiga1.zanr.equals(knjiga2.zanr)){
            System.out.println("U pitanju je ista knjiga.");
        }
        else if (knjiga1.zanr.equals(knjiga2.zanr)){
            System.out.println("U pitanju je isti zanr.");
        }
        else {
            System.out.println("U pitanju su razlicite knjige.");
        }
    }
}
