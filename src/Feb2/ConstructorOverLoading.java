package Feb2;

public class ConstructorOverLoading {

	static int a;
	static int b;
	static int c;
	ConstructorOverLoading(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}

	ConstructorOverLoading(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(a+b+c);
	}

	ConstructorOverLoading(int a, double b) {
		System.out.println(a+b);
		this.a=a;
		this.b=(int)b;
	}

	public static void main(String[] args) {

		
		ConstructorOverLoading cod1=new ConstructorOverLoading(10,15);
		System.out.println("cod1 a ="+cod1.a+" b ="+cod1.b);
		
		ConstructorOverLoading cod2=new ConstructorOverLoading(10, 20, 30);
		System.out.println("cod2 a ="+cod2.a+" b= "+cod2.b+" c= "+cod2.c);
		
		ConstructorOverLoading cod3=new ConstructorOverLoading(10, 2.5);
		System.out.println("cod3 a ="+cod3.a+" b= "+cod3.b);
		
		System.out.println();
		System.out.println("cod1 a "+cod1.a+" b "+cod1.b);
		System.out.println("cod2 a "+cod2.a+" b "+cod2.b+" c "+cod2.c);
		System.out.println("cod3 a "+cod3.a+" b "+cod3.b);
		
	}
	

}
