package NaveenAutomationLabs.FA_Java;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {

		int n = 100;
		int s = n*(n+1)/2;
		System.out.println("sum of 1 to "+n+" = "+s);

		s=0;
		for(int i=1;i<=n;i++) {
			s+=i;
		}
		System.out.println("sum of 1 to "+n+" = "+s);
			
		s=0;
		int i=1;
		while(i<=n) {
			s+=i;
			i++;
		}	
		System.out.println("sum of 1 to "+n+" = "+s);
		
	}

}
