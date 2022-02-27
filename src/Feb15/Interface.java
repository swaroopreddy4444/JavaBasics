package Feb15;

interface A{
	
	int a=10;
	void m1();
	
}

public class Interface implements A{
	
	public void m1() {
		System.out.println("m1 implemented");
	}

	public static void main(String[] args) {

		Interface c=new Interface(); //only Class access
		c.m1();
		System.out.println(a);
		
		A i=new Interface(); //interface access with class
		i.m1();
	}

}
