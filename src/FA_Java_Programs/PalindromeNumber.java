package FA_Java_Programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		sc.close();
		
		int org_num=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10;
			rev+=num%10;
			num/=10;
		}
		if(org_num==rev) {
			System.out.println(org_num+" Palindrome");
		}
		else {
			System.out.println(org_num+" not Palindrome");
		}
	}

}
