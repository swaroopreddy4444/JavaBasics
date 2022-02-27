package Assignments;

public class Calculation {
	
	int x,y,z;
	
	Calculation(int a,int b, int c) {
		x=a;
		y=b;
		z=c;
	}
	int sum() {
		return x+y+z;
	}

	public static void main(String[] args) {
		
		Calculation cal=new Calculation(10, 20, 40);
		
		System.out.println(cal.sum()); 

	}

}
