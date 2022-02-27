package Feb2;

public class MethodoverLoading {

	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void add(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	
	void add(int a, double b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		MethodoverLoading mol=new MethodoverLoading();
		
		mol.add(10, 20);
		mol.add(10, 20.5);
		mol.add(10, 20, 5);
		}

}
