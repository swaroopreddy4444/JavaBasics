package FA_Java_Programs;

public class ArrayMissingNumber {

	public static void main(String[] args) {

		int[] a= {6,3,4,7};
		int sum=0;
		for(int x:a)
			sum+=x;
		
		int start=a[0];
		for(int i=0;i<a.length-1;i++) {
			start=(start<a[i+1])?start:a[i+1];
		}
		int actual_sum=(a.length+1)*(start+start+a.length)/2;
		System.out.println(actual_sum-sum);
	}

}
