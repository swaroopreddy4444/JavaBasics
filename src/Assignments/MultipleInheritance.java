package Assignments;

interface AA{
	int a=12;
	int b=15;
	void add();//unimplemented method
}
interface BB{
	int x=AA.a;
	int y=AA.b;
	default void mul() { // implemented method
		System.out.println("product= "+(x*y));
	};
}
class calculation1 implements AA,BB {
	
	public void add() {
		System.out.println("sum="+(a+b));
	}
//	public void mul() {
//		System.out.println("product="+x*y);
//	}
}
public class MultipleInheritance {
	public static void main(String[] args) {

		calculation1 mi=new calculation1();
		mi.add();
		mi.mul();
		
	}

}
