package traore.Exercice_4_2.Exception;

/**
 * 
 * @author traore-mousso
 * Exception pour le pile
 *
 */
public class ArgumentPileException extends IllegalArgumentException  {
	
	public ArgumentPileException() {
		super("Pas assez d'éléments dans la pile pour cette opération");
	}

}
