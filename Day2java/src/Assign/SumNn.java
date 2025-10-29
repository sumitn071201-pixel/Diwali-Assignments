package Assign;

import java.util.Scanner;

public class SumNn {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter the number ");
	    int n=sc.nextInt();
	    int even=0;
	    int odd=0;
	    for(int i=0;i<=n;i++)
	    {
	    	if(i%2==0)
	    	{
	    		even=even+i;
	    	}
	    	else {
	    		odd=odd+i;
	    	}
	    }
	    System.out.println("Sum of even number "+even);
	    System.out.println("Sum of odd number "+odd);

	}

}
