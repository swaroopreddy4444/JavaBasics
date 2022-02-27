package Assignments;

public class Student {

	int Sid;
	String Sname;
	int Sub1,Sub2,Sub3;
	
	void getStuData(int id,String name){
		Sid=id;
		Sname=name;
	}
	void getStuMarks(int s1,int s2,int s3){
		Sub1=s1;
		Sub2=s2;
		Sub3=s3;
	}
	void TotalMarks(){
		System.out.println(Sid+" "+Sname);
		System.out.println(Sub1+" "+Sub2+" "+Sub3+" => "+(Sub1+Sub2+Sub3));
	}
	
	public static void main(String[] args) {
		
		Student Stu1=new Student();
		Stu1.Sid=101;
		Stu1.Sname="swaroop";
		Stu1.Sub1=80;
		Stu1.Sub2=74;
		Stu1.Sub3=99;
		Stu1.TotalMarks();
		
		Student Stu2=new Student();
		Stu2.getStuData(102, "chandra");
		Stu2.getStuMarks(81, 70, 84);
		Stu2.TotalMarks();
	}

}
