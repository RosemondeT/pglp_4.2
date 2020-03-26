package traore.Exercice_4_2;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author traore-mousso
 * Classe testant les méthodes de la classe MoteurRPN
 */
public class MoteurRPNTest {

	Stack<Double> pile;
	Double valeur, valeur1;
	MoteurRPN moteur = new MoteurRPN();
	MoteurRPN moteur1 = new MoteurRPN();
	
	@Before 
    public void variables() {
		valeur = 2.0;
		valeur1=3.0;	
    }
	
	@Test
	public void enregistrerNbTest() throws Exception
	{
		moteur1.enregistrerNb(valeur);
		
		assertTrue(moteur1.getSizePile()>0);
	}
	
	@Test
	public void getSizePileTest() throws Exception {
		moteur.enregistrerNb(valeur);
		assertEquals(1, moteur.getSizePile());
	}
	
}
