package assignment;

import java.util.Scanner;

public class isPrime {	
	
	public static boolean isPrime(int num) {
	    if (num <= 1) {
	        return false;
	    }

	    for (int i = 2; i <= Math.sqrt(num); i++) {
	        if (num % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}


	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
	   boolean status=isPrime(num);
	   
	   System.out.println(status);
	

	}

}
