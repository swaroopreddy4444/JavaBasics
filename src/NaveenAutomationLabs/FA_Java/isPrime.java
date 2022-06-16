package NaveenAutomationLabs.FA_Java;

public class isPrime {

	public static void main(String[] args) {

		int n=23;
		int prime =0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				prime=1;
				break;
			}
		}
		if(prime==0 && n>1) {
			System.out.println(n+" is prime");
		}else {
			System.out.println(n+" is not prime");

		}
	}

}
