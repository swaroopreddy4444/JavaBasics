package NaveenAutomationLabs.FA_Java;

public class Bin2Dec {

	public static int BinToDec(long num) {
		int dec = 0;
		for (int i = 0;num!=0; num /= 10, i++) {
			dec = (int) ((num % 10 == 1) ? (Math.pow(2, i) + dec) : dec);
		}
		return dec;
	}

	public static void main(String[] args) {

		System.out.println(BinToDec(1001));
	}

}
