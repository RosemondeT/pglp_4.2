package traore.Exercice_4_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author traore-mousso
 * Classe testant les méthodes de la classe SaisieRPN
 *
 */
public class SaisieRPNTest {

	@Test
	public void testVerifierOperateur() {
		SaisieRPN saisie = new SaisieRPN();
		String testOp="-";
		Boolean a = saisie.isOperation(testOp);
		assertTrue( a);
	}
	

	
	

}
