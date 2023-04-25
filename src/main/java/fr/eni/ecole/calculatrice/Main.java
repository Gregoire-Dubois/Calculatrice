package fr.eni.ecole.calculatrice;

import fr.eni.ecole.calculatrice.bo.DepassementCapaciteException;
import fr.eni.ecole.calculatrice.bo.Operation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DepassementCapaciteException {

        Operation op = new Operation();

        Scanner nombre1 = new Scanner(System.in);
        System.out.println("Entrez un premier chiffre entier entre -2 147 483 648 et + 2 147 483 647");
        int nb1 = nombre1.nextInt();

        Scanner symbolChoix = new Scanner(System.in);
        System.out.println("Entrez un des symboles suivants * + / -");
        char symbol = symbolChoix.nextLine().charAt(0);

        Scanner nombre2 = new Scanner(System.in);
        System.out.println("Entrez un second chiffre entier entre -2 147 483 648 et + 2 147 483 647");
        int nb2 = nombre2.nextInt();

        switch (symbol) {
            case '+' -> op.ajouter(nb1, nb2);
            case '-' -> op.soustraire(nb1, nb2);
            case '*' -> op.multiplier(nb1, nb2);
            case '/' -> op.diviser(nb1, nb2);
            default -> System.out.println("Symbole inconnu");
        }
    }
}
