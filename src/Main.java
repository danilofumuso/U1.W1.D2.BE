import Esercizi.esercizio1.Esercizio1;
import Esercizi.esercizio2.Esercizio2;
import Esercizi.esercizio3.Esercizio3;
import Esercizi.esercizio4.Esercizio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Esercizio 1

        System.out.println(Esercizio1.stringaPariDispari("ciao"));

        System.out.println("E' bisestile? " + Esercizio1.annoBisestile(2024));


        //Esercizio 2

        Esercizio2.stampaNumero(5);
        Esercizio2.stampaNumero(3);


        //Esercizio 3
        System.out.println("inserisci una stringa, :q per terminare il programma!");
        String string = scanner.nextLine();
        Esercizio3.spaceBetweenLetters(string);


        //Esercizio 4
       Esercizio4.countdown(6);
   }
}