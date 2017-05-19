package test;

import java.util.Collection;
import java.util.HashSet;

public class Change {
	
	private static int[][] coins = new int[][]{{100, 0}, {50, 0}, {20, 0}, {10, 0}, {5, 0}, {2, 0}, {1, 0}};
	private static int[] coinValues = new int[]{100, 50, 20, 10, 5, 2, 1};
	private static String[] coinNames = new String[]{"One pound", "Fifty pence", "Twenty pence",
			"Ten pence", "Five pence", "Two pence", "One penny"};
	
	public Change(){
		
	}
	
	public Change(FileHandler fh){
		coins = fh.readCoinFile(coins);
	}
	
	public int[][] getCoins(){
		return coins;
	}
	
	public void setCoins(int[][] coins){
		Change.coins = coins;
	}
	

	public void checkIfChangeAvailable(){
		int count = 0;
		for(int i = 0; i< coins.length; i++ ){
			count += coins[i][1];
		}
		if(count == 0){
			Error.emptyError();
        	System.exit(0);
		}
	}
	
	public Collection<Coin> getOptimalChangeFor(int pence){
		
		Collection<Coin> change = new HashSet<Coin>();
		
		whileloop:
		while(pence > 0){
			for(int i = 0; i<coinValues.length; i++){
				if(pence - coinValues[i] >=0){
					change.add(new Coin(coinNames[i], coinValues[i]));
					pence -= coinValues[i];
					continue whileloop;
				}
			}
		}
		
		return change;
		
	}
	
	public Collection<Coin> getChangeFor(int pence){
		
		Collection<Coin> change = new HashSet<Coin>();
		
		whileloop:
		while(pence > 0){
			for(int i = 0; i<coins.length; i++){
				if(pence - coins[i][0] >= 0 && coins[i][1] > 0){
					change.add(new Coin(coinNames[i], coins[i][0]));
					pence -= coins[i][0];
					coins[i][1] -= 1;
					continue whileloop;
				}
			}
				Error.outOfChangeError(pence);
				break;
		}
		
		return change;
		
	}

	
}
