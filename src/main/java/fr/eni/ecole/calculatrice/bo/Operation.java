package fr.eni.ecole.calculatrice.bo;

import java.util.InputMismatchException;

public class Operation {

    public int ajouter(int entier1, int entier2){
        int somme= 0;

        try {

            somme = entier1 + entier2;

        }catch (InputMismatchException e){
            System.err.println("Saisie invalide. Réessayez");
        }
        System.out.println(somme);
        return somme;
    }

    public int soustraire(int entier1, int entier2){
        int resultat = 0;

        try{

            resultat = entier1 - entier2;

        }catch (InputMismatchException e){
            System.err.println("Saisie invalide. Réessayez");

        }
        System.out.println(resultat);
        return resultat;
    }

    public int multiplier(int entier1, int entier2){

        int resultat = 0;


        try {

            resultat = entier1 * entier2;

        }catch (InputMismatchException e){
            System.err.println("Saisie invalide. Réessayez");
        }

        if(resultat > 2147483647){

        }else {
            System.out.println("la mutiliplacation de " + entier1 + " avec " + entier2 +  " dépasse la taille maximale alouée en " +
                    "mémoire. réessayez avec d'autres valueurs plus petites." );
        }
        System.out.println(resultat);
        return resultat;
    }

    public int diviser(int entier1, int entier2){
        int resultat = 0;

        try {

            resultat = entier1 / entier2;

        }catch (ArithmeticException e){
            System.err.println("Il est impossible de diviser par 0");
        }
        System.out.println(resultat);
        return resultat;
    }
}
