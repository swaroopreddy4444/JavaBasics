package FA_Java_Programs;

public class ArrayMaxMinNumber {

	public static void main(String[] args) {

		int[] a= {1,3,5,7};
		
		int min=a[0];
		for(int i=0;i<a.length-1;i++) {
			min=(min<a[i+1])?min:a[i+1];
		}
		System.out.println(min);
		
		int max=a[0];
		for(int i=0;i<a.length-1;i++) {
			max=(max>a[i+1])?max:a[i+1];
		}
		System.out.println(max);
	}

}
