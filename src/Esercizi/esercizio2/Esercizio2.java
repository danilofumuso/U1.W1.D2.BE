package Esercizi.esercizio2;

// SWITCH

public class Esercizio2 {

    public static void stampaNumero(int x){
        switch (x){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore, inserire un numero tra 0 e 3!");
        }
    }

}
