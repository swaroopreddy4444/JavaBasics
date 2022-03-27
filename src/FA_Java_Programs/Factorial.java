package FA_Java_Programs;

public class Factorial {

	public static void main(String[] args) {
		
		int n=10;
		long fact=1;
		for (int i=2;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
