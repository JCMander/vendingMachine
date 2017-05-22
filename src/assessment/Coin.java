package assessment;

public class Coin {
/**
 * @author jordanmander
 * Class used to create objects of coin
 * Class has methods to get the coin name and value(denomination)
 * Class has methods to set new coin names or values
 * **/
	private String coin;
	private int denomination;
	
	public Coin(String coin, int denomination){
		this.coin = coin;
		this.denomination = denomination;
	}
	
	public String getCoin(){
		return coin;
	}
	
	public void setCoin(String coin){
		this.coin = coin;
	}
	
	public int getDenomination(){
		return denomination;
	}
	
	public void setDenomination(int denomination){
		this.denomination = denomination;
	}

}
