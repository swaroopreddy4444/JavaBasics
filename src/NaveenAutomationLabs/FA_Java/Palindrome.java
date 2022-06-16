package NaveenAutomationLabs.FA_Java;

public class Palindrome {

	public static void main(String[] args) {

		int num=4664;
		int rev=0;
		
		int org_num=num;
		
		while(num!=0) {
			rev*=10;
			rev+=num%10;
			num/=10;
		}
		if(org_num==rev) {
			System.out.println("Palindrome");
		}else {

			System.out.println("not Palindrome");
		}
	}

}
