package Feb16;

class A{
	int a=10;
	void m1() {
		System.out.println(a);
	}
	private int b=20;
	private void m2() {
		System.out.println(b);
	}
	protected int c=30;
	protected void m3() {
		
		System.out.println(c);
	}
}


public class AccessModifiers extends A{

	public static void main(String[] args) {

		A am=new A();
		am.m1();
		am.m3();
		
	}

}
