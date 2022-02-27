package Assignments;

interface A{
	int a=5;
	int b=10;
	void sum();
}
class B implements A{
	public void sum(){
		System.out.println(a+b);
	}
}
public class InterfaceSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A x=new B();
		x.sum();
	}

}
