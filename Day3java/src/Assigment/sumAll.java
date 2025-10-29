package Assigment;

import java.util.Scanner;

public class sumAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        
        int sum=0;
        for (int i=0;i<=n;i++)
        {
        	sum=sum+i;
        }
        System.out.println("Sum of all digit : "+sum);

	}

}
