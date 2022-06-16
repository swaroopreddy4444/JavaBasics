package NaveenAutomationLabs.FA_Java;

public class FactorsOfNum {

	public static void main(String[] args) {

		int n=258;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
