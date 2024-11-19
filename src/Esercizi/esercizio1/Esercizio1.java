package Esercizi.esercizio1;

// IF - ELSE IF

public class Esercizio1 {

    public static boolean stringaPariDispari(String string) {
        if (string.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }

        // return string.length() % 2 == 0; metodo rapido
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0 || (anno % 100 == 0 && anno % 400 == 0)) {
            return true;
        } else {
            return false;
        }

        // return anno % 4 == 0 || (anno % 100 == 0 && anno % 400 == 0); metodo rapido
    }

    public static void main(String[] args) {

     // posso creare un metodo main dentro ogni classe per eseguire il codice!

    }

}
