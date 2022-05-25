package NaveenAutomationLabs.FA_Java;

public class PrimeFactors {

	public static void isprime(int num) {

		boolean prime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {

		int n = 1;
		System.out.println("prime factors of " + n);
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isprime(i);
			}

		}
	}
}
