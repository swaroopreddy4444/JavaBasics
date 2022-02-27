package Assignments;

public class SumofArray {

	public static void main(String[] args) {

		int []a=new int[5];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=i*i;
		}
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		for(int i:a) {
			System.out.print(i+"  ");
		}
			
		System.out.println("\n"+sum);
		
	}

}
