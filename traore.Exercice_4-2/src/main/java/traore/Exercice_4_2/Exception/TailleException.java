package traore.Exercice_4_2.Exception;

/**
 * 
 * @author traore-mousso
 * Cette exception est renvoyée si la valeur est trop grande
 *
 */
public class TailleException extends  ArithmeticException{
	
	public TailleException() {
		
		super("Valeur absolue trop grande pour être gérée");
	}
}
