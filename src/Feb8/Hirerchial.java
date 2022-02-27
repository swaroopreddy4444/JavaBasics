package Feb8;

class Parent {
	int a;

	void show() {
		System.out.println("parent " + a);
	}
}

class Child4 extends Parent{
	int b;

	void disp() {
		System.out.println("child4 " + b);
	}
}

class Child5 extends Parent{
	int c;

	void print() {
		System.out.println("child5 " + c);
	}
}


public class Hirerchial {

	public static void main(String[] args) {

		Child4 c4=new Child4();
		c4.a=10;
		c4.b=20;
		c4.show();
		c4.disp();

		Child5 c5=new Child5();
		c5.a=30;
		c5.c=40;
		c5.show();
		c5.print();
		
	}

}
