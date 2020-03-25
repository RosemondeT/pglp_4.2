package traore.Exercice_4_2.Command;

import java.util.Stack;

import traore.Exercice_4_2.DeclencheurException;

/**
 * 
 * @author traore-mousso
 * Sert de stockage
 *
 */
public class StorageNbCommand implements Undonable{
	
	private double nb;
	private Stack<Double> pile;
	
	public StorageNbCommand(Stack<Double> pile, double nb) {
		this.pile = pile;
		this.nb = nb;		
	}
	
	public void undo() {
		this.pile.pop();
		
	}
	
	public void apply() {
		DeclencheurException.handleMinMax(nb);
		this.pile.push(nb);
	}

}
