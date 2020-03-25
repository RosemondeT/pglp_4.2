package traore.Exercice_4_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import traore.Exercice_4_2.Command.Command;
import traore.Exercice_4_2.Command.Quit;
import traore.Exercice_4_2.Command.Undo;
import traore.Exercice_4_2.Command.Undonable;

public class Interpreteur {
	private Stack<Undonable> historique;
	private Invoker invoker;
	private List<String> log;
	
	public Interpreteur() {
		this.historique = new Stack<Undonable>();
		this.invoker = new Invoker();
		this.log = new ArrayList<String>();
	}
	
	/**
	 * Exécute une commande
	 * @param command
	 */
	private void applyCommand(Command command) {
		command.apply();
	}	
	
	/**
	 * Exécute une commande annulable puis la store dans l'historique
	 * La commande n'est pas ajoutée à l'historique si elle lance une exception
	 * @param command
	 * 
	 */
	public void applyStoreCommand(Undonable command) throws Exception {
		try {
			command.apply();
			this.historique.add(command);	
		} catch (Exception e) {
			throw e;
		}
	}
	
	public void undoCommand() {
		this.applyCommand(new Undo(historique));
	}
	
	public void log(String str) {
		this.applyCommand(() -> log.add(str));
	}
	
	public String getLastLog() {
		return log.get(log.size() - 1);
	}
	
	public void shutdown() {
		this.applyCommand(new Quit(invoker));
	}
	
	public boolean isOn() {
		return invoker.isOn();
	}
	
}
