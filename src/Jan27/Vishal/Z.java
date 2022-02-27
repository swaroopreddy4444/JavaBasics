package Jan27.Vishal;


abstract class Vehicle {
	public int speed() {
		return 0;
	}
//	public void exe() {
//		System.out.println("exe super");
//		display();
//	}
}
 class Car extends Vehicle {
	
	public int speed() {
		return 60;
	}

}
 class RaceCar extends Car {
		
	public int speed() {
		return 120;
	}

}
 public class Z{
	 public static void main(String[] args) {
		RaceCar r = new RaceCar();
		Car c = new RaceCar();
		Vehicle v = new RaceCar();
		
		System.out.println(r.speed()+" "+c.speed()+" "+v.speed());
	}
 }
