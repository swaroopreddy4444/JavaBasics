package Feb8;

 class Child1 {
	
	int a;
	void show() {
		System.out.println(a);
	}
 }
 
class Child2 extends Child1 {
	int b;
	void print() {
		System.out.println(b);
	}
}
	
class Child3 extends Child2 {
	
	int c;
	void disp() {
		System.out.println(c);
	}
}

