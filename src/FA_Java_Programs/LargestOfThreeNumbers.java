package FA_Java_Programs;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("a= ");
		int a=sc.nextInt();
		System.out.print("b= ");
		int b=sc.nextInt();
		System.out.print("c= ");
		int c=sc.nextInt();
		sc.close();

//...............method 1		
//		if(a>b)
//			if(a>c) 
//				System.out.println(a+" is largest");
//			else 
//				System.out.println(c+" is largest");
//		else if(b>c)
//			System.out.println(b+" is largest");
//		else
//			System.out.println(c+" is largest");	
	
//.............method 2
		
//		int x=a>b?a:b;
//			x=x>c?x:c;
		
//....................method 3	
		int x=c>(a>b?a:b)?c:(a>b?a:b);		

			System.out.println(x+" is largest");	
	}
}	
