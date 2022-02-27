package Feb12;

class SuperKeyTest {

	String color = "red";

	SuperKeyTest() {
		System.out.println("parent constructor");
	}
	void res() {
		System.out.println("parent method color = " + color);
	}
}

class SuperChild extends SuperKeyTest {

	String color = "blue";

	SuperChild() {
		super();// it's not required invoking parent constructor because its default
		System.out.println("Child constructor");
	}
	void res() {
		
		
		System.out.println("child method color = " + color);
		
		// parent variable invoking using super
		System.out.println("parent variable color = " + super.color);

		// parent method invoking using super
		super.res();
	}
}