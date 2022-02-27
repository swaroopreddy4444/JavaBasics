package Assignments;

class Teacher1 {
	String Desg = "Teacher";
	String collegeName="Beginner books";
	void does() {
		System.out.println("teaching......");
	}
	}

class ComputerTeacher extends Teacher1{
	String Desg = "Computer Teacher";
	
	void does() {
		System.out.println("teaching computer......"+super.Desg);
		super.does();
	}
	
}
public class Teacher{
	public static void main(String[] args) {
		
		ComputerTeacher T=new ComputerTeacher();
		System.out.println(T.Desg+"\t"+T.collegeName);
		T.does();
		
	}
}

