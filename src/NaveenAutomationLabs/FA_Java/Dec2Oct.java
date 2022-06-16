package NaveenAutomationLabs.FA_Java;


public class Dec2Oct {

	public static int DecToOct(int num) {
		int Oct=0;
		
		for(int pos=1;num!=0;num/=8) {
			int place=num%8;
			Oct+=place*pos;
			pos*=10;
		}
		
		return Oct;
	}
	public static void main(String[] args) {

		System.out.println(DecToOct(109));
		
	}

}
