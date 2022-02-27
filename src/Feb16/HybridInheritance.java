package Feb16;

class A1{
	void m1() {
		System.out.println("This is m1 method from class A1");
	}
}
interface B1{
	void m2();
}
interface B2{
	void m3();
}

public class HybridInheritance extends A1 implements B1,B2{

	public void m2() {
		System.out.println("This is m2 method from interface B1");
	}
	public void m3() {
		System.out.println("This is m3 method from interface B2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridInheritance hi=new HybridInheritance();
		hi.m1();
		hi.m2();
		hi.m3();
	}

}
