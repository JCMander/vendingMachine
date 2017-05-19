package test;

import java.util.Collection;
import javax.swing.JOptionPane;

public class VendingMachine {
/**
 * @author jordanmander
 * Main class, from where the program runs
 * **/
	
	public static void main(String[] args) {
		
		UserOutput uo;
		Change ch;
		Collection<Coin> change;
		FileHandler fh = null;
		int pence = 0;
		
		int taskSelection = JOptionPane.showConfirmDialog(null,
				"Would you like to load the number of coins in the machine through a coin-inventory.properties file?",
				"Choose a task", JOptionPane.YES_NO_OPTION);
		
		if(taskSelection == JOptionPane.YES_OPTION){
			fh = new FileHandler();
			ch = new Change(fh);
			ch.checkIfChangeAvailable();
			pence = getPence();
			change = ch.getChangeFor(pence);
			uo = new UserOutput(ch, change);
			fh.writeCoinFile(ch.getCoins());
		}else{
			ch = new Change();
			pence = getPence();
			change = ch.getOptimalChangeFor(pence);
			uo = new UserOutput(change);
		}
		
		uo.displayChange(pence);
		
	}
	
	public static int getPence(){
		int pence = Integer.parseInt((String)JOptionPane.showInputDialog("Enter the number of pence"));
		return pence;
	}
	
}