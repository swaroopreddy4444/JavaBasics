package Feb7;

public class thiskeyword {

	static int a=10, b=5;
	
	 void add(int a,int b) {
		thiskeyword.a=a; 
		thiskeyword.b=b;
		System.out.println(a+b);
	}
	public static void main(String[] args) {

		thiskeyword x=new thiskeyword();
		x.add(10,40);
		

	}

}
