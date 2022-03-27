package FA_Java_Programs;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		sc.close();
		
		  int count=0; 
		  while(n!=0) { 
			  n/=10;
			  count++;
			 }
		 
	
		 
		System.out.println("Number of Digits: "+count);
	}
	

}
