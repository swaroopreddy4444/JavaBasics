package FA_Java_Programs;

public class ReverseNumber {

	public static void main(String[] args) {

		int n=123;
		
		  int rev=0; while(n!=0) { rev*=10; rev+=n%10; n/=10; }
		 
		// StringBuffer method
		
		/*
		 * StringBuffer sb=new StringBuffer(String.valueOf(n)); StringBuffer
		 * rev=sb.reverse();
		 */
		// StringBuilder method
		/*
		 * StringBuilder rev=new StringBuilder(); rev.append(n); rev.reverse();
		 */
		System.out.println(rev);
	}
	

}
