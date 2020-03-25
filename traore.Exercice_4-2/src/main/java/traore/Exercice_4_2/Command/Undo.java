package traore.Exercice_4_2.Command;

import java.util.Stack;

import traore.Exercice_4_2.DeclencheurException;

/**
 * 
 * @author traore-mousso
 * Permet de revenir en arrière
 *
 */
public class Undo implements Command {

	
	private Undonable lastCommand;
	
	public Undo(Stack<Undonable> historique) {
		DeclencheurException.handleStackSize(historique.size(), 1);
		this.lastCommand = historique.pop();
	}

	public void apply() {
		lastCommand.undo();	
		
	}

}
