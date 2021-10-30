package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=13;
		boolean flag=false;
		
		for (int i = 2; i < input; i++) {
			
			if (input%i==0) {
				flag=true;
				break;
							}
			
										}
		
				if (flag== true) {
			  System.out.println("The Given Number " + input + " is Not a Prime number");
		}
		else {
			System.out.println("The Given Number " + input + " is a Prime number");
		}
	}
}
		  
	
		
		
	


