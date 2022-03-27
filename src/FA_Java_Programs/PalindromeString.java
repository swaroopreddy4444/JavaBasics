package FA_Java_Programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str=sc.nextLine();
		sc.close();
		
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		if(str.equals(rev)) {
					
//		StringBuffer sb=new StringBuffer(str);
//		StringBuffer rev=sb.reverse();
//		if(str.equals(rev.toString())) {
			
			System.out.println('"'+str+'"'+" Palindrome String");
		}
		else {
			System.out.println('"'+str+'"'+" not Palindrome String");
		}
	}

}
