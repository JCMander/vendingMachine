package test;

public class Error {
	
	public static void emptyError(){
		System.out.println("There are no coins in the vending machine.");
	}
	
	public static void outOfChangeError(int pence){
		System.out.println("There is no more change available to give you the remaining £" + (double)pence/100);
	}
	
}
