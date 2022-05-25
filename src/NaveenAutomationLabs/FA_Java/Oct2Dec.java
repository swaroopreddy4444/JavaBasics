package NaveenAutomationLabs.FA_Java;

public class Oct2Dec {

	public static int OctToDec(int num) {
		int Dec=0;
		for(int i=0;num!=0;i++) {
			Dec+=Math.pow(8, i)*(num%10);
			num/=10;
		}
		
		return Dec;
	}
	
	
	public static void main(String[] args) {

		System.out.println(OctToDec(116));
	}

}
