package fr.eni.ecole.calculatrice.bo;

import java.util.InputMismatchException;

public class Operation {
    final long minLong = -2147483648;
    final long maxLong = 2147483647;

    int somme= 0;
    long resLong = 0;

    public void ajouter(int entier1, int entier2)throws DepassementCapaciteException{


        try {

            somme = entier1 + entier2;
            resLong = (long) entier1 + (long) entier2;


            if (resLong<minLong || resLong> maxLong){
                throw new DepassementCapaciteException();
            }

        }catch (InputMismatchException e){
            System.err.println("Saisie invalide. Réessayez");
        }
        System.out.println(somme);
    }

    public void soustraire(int entier1, int entier2){
        int resultat = 0;

        try{

            resultat = entier1 - entier2;

        }catch (InputMismatchException e){
            System.err.println("Saisie invalide. Réessayez");

        }
        System.out.println(resultat);
    }

    public void multiplier(int entier1, int entier2)throws DepassementCapaciteException{

        int resultat = 0;

        try {


            resultat = entier1 * entier2;
            resLong = (long) entier1 * (long)entier2;

        }catch (InputMismatchException e){
            System.err.println("Saisie invalide. Réessayez");
        }

        if(resLong > maxLong){
            throw new DepassementCapaciteException();

        }else {
            System.out.println("la mutiliplacation de " + entier1 + " avec " + entier2 +  " dépasse la taille maximale alouée en " +
                    "mémoire. réessayez avec d'autres valueurs plus petites." );
        }
        System.out.println(resultat);
    }

    public void diviser(int entier1, int entier2){
        int resultat = 0;

        try {

            resultat = entier1 / entier2;

        }catch (ArithmeticException e){
            System.err.println("Il est impossible de diviser par 0");
        }
        System.out.println(resultat);
    }
}
