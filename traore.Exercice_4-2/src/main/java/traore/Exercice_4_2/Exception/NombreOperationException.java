package traore.Exercice_4_2.Exception;

/**
 * 
 * @author traore-mousso
 * Exception pour le cas où la pile n'a pas été utilisée entièrement par manque d'opérations
 *
 */

public class NombreOperationException extends IllegalArgumentException {

	public NombreOperationException() {
		super("Il n'y a pas assez d'opérations, il reste au moins deux nombres dans la pile");
	}

}