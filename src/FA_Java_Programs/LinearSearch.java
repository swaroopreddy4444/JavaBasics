package FA_Java_Programs;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] a= {2,3,4,5,6,9,6};
		
		int x=4;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				System.out.println("found "+x+" at "+i+" index");
				flag=true;
			}
		}
		if(flag==false)
			System.out.println(x+" not found");
	}
}
