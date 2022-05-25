package NaveenAutomationLabs.FA_Java;

public class CountDigits {

	public static void main(String[] args) {

		long n=9989087389l;
		int count=0;
		
		while(n!=0) {
			n/=10;
			count++;
		}
		System.out.println(count+" digits");
	}

}
