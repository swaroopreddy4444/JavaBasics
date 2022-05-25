package NaveenAutomationLabs.FA_Java;

import java.util.Scanner;

public class EvenOddCheck {

	public static void main(String[] args) {

		System.out.print("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		String result = (a%2==0)?"even":"odd";
		System.out.println(a+" is "+result);
	}

}
