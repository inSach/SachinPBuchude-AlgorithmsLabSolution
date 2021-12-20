package com.greatlearning.dslabsession;

import java.util.Scanner;

public class Transaction {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in); // initiate scanner object to read user input
		
		System.out.println("Please enter Number of transactions done.");
		int transactionCount = scan.nextInt(); // Get size of transaction array.
		
		int[] transactionArray = new int [transactionCount];
		System.out.println("Enter the values of transactions.");
		for(int i=1; i<= transactionArray.length; i++) {  // Accept transaction values for each transaction from user.
			System.out.println("Enter value for transaction number "+ i+": ");
			transactionArray[i-1] = scan.nextInt();
		}
		String toContinue = "yes";
		while(toContinue.toLowerCase().equals("yes")) { // Loop till user want to check for different Targets 
			String result = "Target not achieved";
			System.out.println("Please enter target value"); // Get target value from User.
			long targetValue = scan.nextInt();
			long sum = 0;
			for(int j=1; j<=transactionArray.length; j++){ 
				sum = sum + transactionArray[j-1]; // Sum the transaction values
				if(sum >= targetValue) {
					result = "Target achieved after "+j+" transactions";
					break;
				}
			}
			System.out.println(result);
			
			System.out.println("To continue for next Target type 'yes'.");
			toContinue = scan.next();
		}
	}
	
	
	
}
