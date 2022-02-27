package Assignments;

public class CalculationOL { 

	Object sum(int a,double b) {
		return a+b;
	}
	Object sum(double a,double b) {
		return a+b;
	}
	Object sum(int a,int b, int c) {
		return a+b+c;
	}
	double sum(double a,double b,double c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {

		CalculationOL cal=new CalculationOL();
		System.out.println((double)cal.sum(2, 3)+(double)cal.sum(2, 40, 4.5));
		System.out.println(cal.sum(2, 3.7));
		System.out.println(cal.sum(2, 3, 4));
		System.out.println(cal.sum(2, 3.5, 6.5));
		}

}
