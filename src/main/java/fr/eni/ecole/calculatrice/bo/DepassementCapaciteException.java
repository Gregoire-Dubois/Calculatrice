package fr.eni.ecole.calculatrice.bo;

public class DepassementCapaciteException extends Exception {

    public DepassementCapaciteException(){
        super("Le résultat dépasse la capicité de la calculatrice");
    }
}
