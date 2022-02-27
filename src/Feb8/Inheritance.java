package Feb8;


public class Inheritance {

	public static void main(String[] args) {

		Child1 c1 = new Child1();
		c1.a = 10;
		c1.show();

		Child2 c2 = new Child2();
		c2.b = 20;
		c2.print();
		c2.a = 20;
		c2.show();
		System.out.println(c2.a + c2.b);

		Child3 c3 = new Child3();
		c3.c = 30;
		c3.disp();
		c3.b = 20;
		c3.print();
		c3.a = 20;
		c3.show();
		System.out.println(c3.a + c3.b+ c3.c);

	}

}
