package OnlineCourse;

public class Static {

	static int a=10;
	int b=20;
	
	static void m1() {
		System.out.println("M1 static method");
		Static x=new Static();
		System.out.println(x.b);
		x.m2();
	}
	
	void m2() {
		System.out.println("M2 non static");
	}
	
	void m3() {
		System.out.println("M3 non static method..");
		System.out.println(a+" "+b);
		m1();
		m2();
	}
	public static void main(String[] args) {

		System.out.println(a);
		m1();
		
		Static x=new Static();
		System.out.println(x.b);
		x.m2();
		
		x.m3();
		
	}

}
