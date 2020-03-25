package traore.Exercice_4_2.Command;

import java.util.Stack;

import traore.Exercice_4_2.DeclencheurException;
import traore.Exercice_4_2.Operation;

/**
 * 
 * @author traore-mousso
 * Classe CommandOperater
 *
 */
public class CommandOperater implements Undonable{
	private double dernier;
	private double avantDernier;
	private Operation operation;
	private Stack<Double> pile;
	
	
	public CommandOperater(Stack<Double> pile, Operation operation) {
		DeclencheurException.handleStackSize(pile.size(), 2);
		this.pile = pile;
		this.operation = operation;
	}
	
	
	public void apply() {
		double result;
		this.dernier = this.pile.pop();
		this.avantDernier = this.pile.pop();
		try {
			result = operation.eval(avantDernier, dernier);
			DeclencheurException.handleMinMax(result);
			this.pile.push(result);
		}
		catch (ArithmeticException e) {
			this.pile.push(avantDernier);
			this.pile.push(dernier);
			throw e;
		}
	}
	

	public void undo() {
		this.pile.pop();
		this.pile.push(avantDernier);
		this.pile.push(dernier);
		
	}

}
