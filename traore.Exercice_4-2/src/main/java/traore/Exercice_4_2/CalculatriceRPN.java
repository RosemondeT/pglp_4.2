package traore.Exercice_4_2;

public enum CalculatriceRPN {
calculatrice;
	
	public void run( String[] args) {
		SaisieRPN saisie = new SaisieRPN();
		saisie.saisie();
	}
	
	public static void main( String[] args ) {
		calculatrice.run(args);
		
	}

}
