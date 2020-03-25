package traore.Exercice_4_2;
/**
 * 
 * @author traore-mousso
 * Classe Invoker
 *
 */


public class Invoker {
	private boolean invokerOn;
	/**
	 * @param invokerOn
	 */
public Invoker() {
	this.invokerOn=true;
}

public boolean isOn() {
	return invokerOn;
}

public void turnOff() {
	invokerOn = false;
}	

public void turnOn() {
	invokerOn = true;
}	

}
