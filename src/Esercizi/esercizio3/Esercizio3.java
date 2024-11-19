package Esercizi.esercizio3;

// WHILE

public class Esercizio3 {

    public static void spaceBetweenLetters(String string) {

        while (!string.equals(":q")) {
            String result = String.join(",", string.split(""));
            System.out.println(result);

        }

        System.out.println("Programma Terminato!");

    }
}