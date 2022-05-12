package Assignments_by_Javalaya;

public class equilateralTriangle {

	public static void eqTriangle(int i) {
		for(int j=1;j<=i;j++) {
			System.out.format("%"+(i+j)+"s"+"%n","* ".repeat(j));
		}
		for(int j=i;j>=1;j--) {
			System.out.format("%"+(i+j)+"s"+"%n","* ".repeat(j));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eqTriangle(5);
	}

}
