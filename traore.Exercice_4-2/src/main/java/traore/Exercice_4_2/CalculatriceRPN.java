package traore.Exercice_4_2;

/**
 * 
 * @author traore-mousso
 * Programme principal de l'application comme un SINGLETON avec une ennumération
 *
 */
public enum CalculatriceRPN {
ENVIRONNEMENT;
	
	public void run( String[] args) {
		SaisieRPN saisie = new SaisieRPN();
		saisie.saisie();
	}
	
	public static void main( String[] args ) {
		ENVIRONNEMENT.run(args);
		
	}

	
	
}
