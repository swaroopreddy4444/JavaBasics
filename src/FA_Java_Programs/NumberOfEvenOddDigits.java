package FA_Java_Programs;

import java.util.Scanner;

public class NumberOfEvenOddDigits {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		sc.close();
		
		  int e=0,o=0; 
		  while(n!=0) {
			  if(n%2==0)
				  e++;
			  else
				  o++;
			  n/=10;
			 }
		 
	

			System.out.println("Number of Even Digits: "+e);
			System.out.println("Number of  Odd Digits: "+o);
	}
	

}
