package NaveenAutomationLabs.FA_Java;

public class NumAsSumOfPrimes {

	public static boolean prime(int num) {
		boolean check=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				check=false;
				break;
			}
		}
		return check;
	}
	public static void main(String[] args) {

		int n=98;
		for(int i=2;i<=n/2;i++) {
			if(prime(i) && prime(n-i)) {
				System.out.println(n+" = "+i+"+"+(n-i));
			}
		}
	}
}
