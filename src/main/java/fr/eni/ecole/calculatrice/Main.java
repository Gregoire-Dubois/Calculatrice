package fr.eni.ecole.calculatrice;

import fr.eni.ecole.calculatrice.bo.Operation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operation op = new Operation();


        Scanner nombre1 = new Scanner(System.in);
        System.out.println("Entrez un premier chiffre entier entre -2 147 483 648 et + 2 147 483 647");
        int nb1 = nombre1.nextInt();


        Scanner symbolChoix = new Scanner(System.in);
        System.out.println("Entrez un des symboles suivants * + / -");
        char symbol = symbolChoix.nextLine().charAt(0);

        Scanner nombre2 = new Scanner(System.in);
        System.out.println("Entrez un premier chiffre entier entre -2 147 483 648 et + 2 147 483 647");
        int nb2 = nombre1.nextInt();


        switch (symbol){

            case '+' :
                op.ajouter(nb1, nb2);
                break;
            case  '-' :
                op.soustraire(nb1, nb2);
                break;
            case '*' :
                op.multiplier(nb1, nb2);
                break;
            case '/' :
                op.diviser(nb1, nb2);
                break;
            default:
                System.out.println("Symbole inconnu");
        }
    }
}
