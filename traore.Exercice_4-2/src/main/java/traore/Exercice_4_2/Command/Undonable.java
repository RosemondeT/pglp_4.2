package traore.Exercice_4_2.Command;

/**
 * 
 * @author traore-mousso
 * En créant l'interface Undonable cela permet de respecter
 * ISP (segregation des interfaces)
 */
public interface Undonable extends Command {
	public void undo();
}
