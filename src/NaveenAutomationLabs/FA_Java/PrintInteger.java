package NaveenAutomationLabs.FA_Java;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {

		System.out.print("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		System.out.println("You Entered :"+x);
	}

}
