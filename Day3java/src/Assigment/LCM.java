package Assigment;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        
        int gcd=findGCD(a,b);
        int lcm=(a * b)/gcd;
        
        System.out.println("GCD of "+a+" and "+b+" = "+gcd);
        System.out.println("LCM of "+a+" and "+b+" = "+lcm);

	}
	public static int findGCD(int x,int y)
	{
		while(y != 0) {
			int temp=y;
			
			y=x%y;
			x=temp;
		}
		return x;
	}

}
