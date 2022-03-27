package FA_Java_Programs;

import java.util.Arrays;
import java.util.Collections;

public class SortMethods {

	public static void main(String[] args) {

		int[] a= {11,5,1,21,0,10,16,12};
		System.out.println(Arrays.toString(a));
		
//		Arrays.parallelSort(a);
//		System.out.println(Arrays.toString(a));
		
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
	
		Integer[] b={11,5,1,21,0,10,16,12};
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println(Arrays.toString(b));
		
	}

}
