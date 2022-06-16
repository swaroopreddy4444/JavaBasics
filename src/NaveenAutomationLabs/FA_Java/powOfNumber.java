package NaveenAutomationLabs.FA_Java;

public class powOfNumber {

	public static void main(String[] args) {

		int b=2;
		int e=10;

		System.out.println(Math.pow(b,e ));

		long res =1;
		while(e!=0) {
			res*=b;
			e--;
		}
		System.out.println(res);
	}

}
