package FA_Java_Programs;

public class PrimeOrNot {

	public static void main(String[] args) {

		int n=2;
		int c=0;
		int last=(int) Math.sqrt(n);
//		for(int i=2;i<n;i++) // c==0
//		for(int i=1;i<n;i++) // c==1
//		for(int i=1;i<=n;i++)// c==2
		for(int i=2;i<=last;i++)// c==0
			{
			if(n%i==0) {
				c++;
				break; //if c==0 method only
			}	
		}
		if(c==0) { // c==0
//		if(c==1) { // c==1
//		if(c==2) { // c==2
			
			System.out.println(n+" is prime");
		}
		else {
			System.out.println(n+" is not prime");
		}
		
	}

}
