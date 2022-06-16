package NaveenAutomationLabs.FA_Java;

public class Dec2Bin {

	public static long DecToBin(Integer num) {

		long Bin = 0;
		for (int position = 1; num != 0; num /= 2) {
			int place_value = num % 2;
			Bin += place_value * position;
			position *= 10;
		}
		return Bin;
	}
	public static void main(String[] args) {
		System.out.println(DecToBin(18));
	}

}
