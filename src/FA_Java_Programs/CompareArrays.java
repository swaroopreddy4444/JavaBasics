package FA_Java_Programs;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {

		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,5};
		
//		if(Arrays.equals(a,b))
//			System.out.println("Arrays are equal");
//		else
//			System.out.println("Arrays are NOT equal");
		
		int x=0;
		if(a.length==b.length) 
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					x=1;
					break;
				}
			}
		else 
			x=1;
		if(x==0)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are NOT equal");
	}

}
