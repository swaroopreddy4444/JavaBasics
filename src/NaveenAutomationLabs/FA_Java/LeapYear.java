package NaveenAutomationLabs.FA_Java;

public class LeapYear {

	public static void main(String[] args) {

		int year = 2406;
		boolean leap = false;
		if (year % 4 == 0) { //check /4
			if (year % 400 == 0) { //check /400
				leap = true;
			} else if (year % 100 != 0) { // check not century
				leap = true;
			}
		}
		if (leap) {
			System.out.println(year + " = leap year");
		} else {
			System.out.println(year + " = not leap year");
		}
	}

}
