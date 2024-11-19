package Esercizi.esercizio3;

import java.util.Scanner;

// WHILE

public class Esercizio3 {

    static Scanner scanner = new Scanner(System.in);

    public static void spaceBetweenLetters() {

        System.out.println("inserisci una stringa, :q per terminare il programma!");

        String string = "";

        while (!string.equals(":q")) {
            string = scanner.nextLine();

            String result = String.join(",", string.split(""));
            System.out.println(result);

        }

        System.out.println("Programma Terminato!");

    }
}