package FA_Java_Programs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		sc.close();
		
		  int sum=0; 
		  while(n!=0) { 
			  sum+=n%10;
			  n/=10;
			 }
		 
	
		 
		System.out.println("Sum of Digits: "+sum);
	}
	

}
