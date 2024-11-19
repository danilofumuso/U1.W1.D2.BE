package Esercizi.esercizio3;

import java.util.Scanner;

// WHILE

public class Esercizio3 {

    static Scanner scanner = new Scanner(System.in);

    public static void spaceBetweenLetters() {

        System.out.println("inserisci una stringa, :q per terminare il programma!");

        String string;

        while (true) {
            string = scanner.nextLine();

            if (string.equals(":q")) {
                break;
            }

            String result = String.join(",", string.split(""));
            System.out.println(result);

        }

        System.out.println("Programma Terminato!");
        scanner.close();
    }
}