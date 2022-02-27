package Assignments;

public class SearchNum {

	public static void main(String[] args) {

		int []a= {1,2,3,4,345,43,432,21,342};
		int x=0;
		int ser=3;
		for(int i=0;i<a.length;i++) {

			if(a[i]==ser) {
				System.out.println(ser+" found");
				x=1;
				break;
			}
			
		}
		if(x==0) {
			System.out.println(ser+" not found");				
		}
		
	}

}
