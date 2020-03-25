package traore.Exercice_4_2.Exception;

/**
 * 
 * @author traore-mousso
 *Génère une exception lorsqu'on essaie de diviser un nombre par zero
 *
 */

public class DivisionParZeroException extends ArithmeticException {
	
	public DivisionParZeroException() {
		super("Division par zéro");
	}

}