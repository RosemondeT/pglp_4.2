package traore.Exercice_4_2;


import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import traore.Exercice_4_2.Exception.DivisionParZeroException;

/**
 * 
 * @author traore-mousso
 * Classe testant les méthodes de la classe Opération
 *
 */
public class OperationTest {

Double a,b,resultatAttendu;
	
	@Before 
    public void variables() {
		a = 4.0;
		b = 0.0;
    }
	
	@Test
	public void evalPlus() 
	{
		Operation plus = Operation.PLUS;
		resultatAttendu = 4.0;
		assertTrue("La valeur est exact", plus.eval(a, b) == resultatAttendu);
	}
	
	@Test
	public void evalMoins()
	{
		Operation moins = Operation.MOINS;
		resultatAttendu = 4.0;
		assertTrue("La valeur est exact", moins.eval(a, b) == resultatAttendu);
	}
	
	@Test
	public void evalMult()
	{
		Operation moins = Operation.MULT;
		resultatAttendu = 0.0;
		assertTrue("La valeur est exact", moins.eval(a, b) == resultatAttendu);
	}
	
	
	/*@Test
	public void evalDiv(){

		Operation div = Operation.DIV;
		resultatAttendu = Double.POSITIVE_INFINITY;
		assertTrue("Division par zero", div.eval(a, b) == resultatAttendu);
		
		
		
	}*/

}
