package traore.Exercice_4_2;
import traore.Exercice_4_2.Exception.ArgumentPileException;
import traore.Exercice_4_2.Exception.TailleException;



public class DeclencheurException {

	private static final double MIN_VALUE = 100000;
	private static final double MAX_VALUE = 100000;
	
	public static void handleMinMax(double nb) {
		if(nb > MAX_VALUE || nb < -MIN_VALUE) {
			throw new TailleException();
		}
	}
	
	public static void handleStackSize(int actualSize, int wantedSize) {
		if(actualSize < wantedSize) {
			throw new ArgumentPileException();
		}
	}

}
