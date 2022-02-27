package Feb2;

public class MainMethodOverloading {

	void main(int a, int b) {
		System.out.println(a+b);
	}
	
	void main(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	
	void main(int a, double b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		MainMethodOverloading mol=new MainMethodOverloading();
		
		mol.main(10, 20);
		mol.main(10, 20.5);
		mol.main(10, 20, 5);
		}

}
