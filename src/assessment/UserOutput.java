package assessment;

import java.util.Collection;

public class UserOutput {
	private Change ch;
	private Collection<Coin> change;
	
	public UserOutput(Change ch, Collection<Coin> change){
		this.ch = ch;
		this.change = change;
	}
	
	public UserOutput(Collection<Coin> change){
		this.change = change;
	}
	
	public void displayCoinsInMachine(){
        for(int i = 0; i<ch.getCoins().length; i++){
			System.out.println(ch.getCoins()[i][0] + ":" + ch.getCoins()[i][1]);
		}
	}
	
	public void displayChange(int pence){
		System.out.println("£" + String.format("%.2f", (double)pence/100) + " given.");
		double totalChange = 0;
		for(Coin coin: change){
			totalChange += coin.getDenomination();
		}
		if(totalChange == 0){
			System.out.println("You will not receive any change");
		}else{
			totalChange = totalChange/100;
			System.out.println("You will receive £" + String.format("%.2f", totalChange) + " change in " + change.size() + " coins. They are:");
			for (Coin coin : change) {
		        System.out.println(coin.getCoin());
			}
	    }
	}

}
