package fr.eni.ecole.calculatrice.bo;

public class DepassementCapaciteException extends Exception {

    private static final long depassement = 1L;

    public DepassementCapaciteException(){
        super("Le résultat dépasse la capicité de la calculatrice");
    }
}
