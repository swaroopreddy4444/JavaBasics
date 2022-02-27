package Jan31;

public class DifferentMethods {

	int x=10;
	int y=20;
	
	void sum() {
		System.out.println(x+y);
	}
	
	int add(int x, int y) {
		return x+y;
	}
	
	void total(int a, int b) {
		System.out.println(a+b);
	}
	
	int tot() {
		return x+y;
	}
	
	
	
	
	public static void main(String[] args) {

		DifferentMethods a=new DifferentMethods();
		
		a.sum();
		
		System.out.println(a.add(20, 30));
		
		a.total(30, 40);
		
		System.out.println(a.tot());
		
	}

}
