package Feb13.Vishal;

class Test extends StaticTest {
	
	static int x=10;
	
	static void me1(){
		x=12;
		System.out.println(x);
	}
	
public static void main(String[] args) {

	StaticTest s=new Test();
	Test s1=new Test();
		s.me1();
		s1.me1();
	}


}
