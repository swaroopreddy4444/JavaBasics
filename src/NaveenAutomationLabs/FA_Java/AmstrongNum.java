package NaveenAutomationLabs.FA_Java;

public class AmstrongNum {

	public static void main(String[] args) {

		int n = 370, length = 0;
		for (int temp = n; temp != 0; temp /= 10, length++); // to find length
		double Armstrong = 0;
		
		int temp = n;
		while (temp != 0) {
			Armstrong += Math.pow(temp % 10, length);
			temp /= 10;
		}
		if (n == Armstrong)
			System.out.println(n + " is Armstrong");
		else
			System.out.println(n + " is not Armstrong");
	}

}
