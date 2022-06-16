package NaveenAutomationLabs.FA_Java;

public class reverseAnumber {

	public static void main(String[] args) {

		int n=1234;
		
		int r=0;
		
		while(n!=0) {

			r*=10;
			r+=n%10;
			n/=10;
			
		}
		System.out.println(r);
	}

}
