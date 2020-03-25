package traore.Exercice_4_2.Command;

import traore.Exercice_4_2.Invoker;

/**
 * 
 * @author traore-mousso
 * Classer Quit permet de quitter le programme
 *
 */

public class Quit implements Command{
	private Invoker invoker;
	
	public Quit(Invoker invoker) {
		this.invoker = invoker;
	}

	public void apply() {
		invoker.turnOff();
	}

}
