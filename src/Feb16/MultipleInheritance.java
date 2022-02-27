package Feb16;

interface ABC{
	int a=10;
	void m1();
}

interface XYZ{
	int y=20;
	void m2();
}


public class MultipleInheritance implements ABC,XYZ{

	public void m1(){
		System.out.println("a="+a);
	}
	public void m2(){
		System.out.println("y="+y);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance mi=new MultipleInheritance();
		mi.m1();
		mi.m2();
		System.out.println("sum="+(a+y));
	}

}
