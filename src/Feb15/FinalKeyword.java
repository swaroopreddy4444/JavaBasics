package Feb15;

final class bike{
	
	final void run() {
		System.out.println("Bike is running");
	}
}
//class Honda extends bike{
//	
////	void run() {
////		System.out.println("Honda is running");
////	}
//}
public class FinalKeyword {

	final double pi=3.14;// we cannot change the value 
	
	
	public static void main(String[] args) {

		
		FinalKeyword fk=new FinalKeyword();
		//fk.pi*=2; // compile error
		System.out.println(fk.pi);
//		Honda h=new Honda();
//		h.run();
		bike b=new bike();
		b.run();
		
	}

}
