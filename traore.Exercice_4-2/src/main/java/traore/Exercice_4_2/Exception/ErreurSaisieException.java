package traore.Exercice_4_2.Exception;

/**
 * 
 * @author traore-mousso
 * Génère une erreur lorsqu'il y'a une erreur de saisie
 *
 */

public class ErreurSaisieException extends IllegalArgumentException {

	public ErreurSaisieException() {
		super("Erreur de saisie.");
	}

}