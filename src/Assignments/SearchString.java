package Assignments;

public class SearchString {

	public static void main(String[] args) {


		String []a=new String[5];
		a[0]="swaroop";
		a[1]="vishal";
		a[2]="super";
		a[3]="gowthami";
		a[4]="chandra";
		
		String ser="chandra";
		int x=0;
		for(int i=0;i<a.length;i++) {
			if(ser==a[i]) {
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
