package FA_Java_Programs;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Prime numbers upto : ");
		int n=sc.nextInt();
		sc.close();
		
		for(int i=2;i<n+1;i++) {
			int c=0;
			for (int j=2;j<i;j++) {
				if(i%j==0) {
					c++;
					break;
				}
			}
			if(c==0) {
				System.out.print(i+" ");
			}
		}
		
	}
}
