package Jan27;

public class Employee {
	
	int EId;
	String EName;
	double sal;
	int deptno;
	String Desg;
	
	void display()
	{
		System.out.println(EId+"\t"+EName+"\t"+sal+"\t"+deptno+"\t"+Desg);
	}
	
	
	public static void main(String[] args) {

		Employee Emp1 =new Employee();// new object Emp1 for Employee class
		Emp1.EId=1001;
		Emp1.EName="Swaroop Reddy";
		Emp1.sal=15000;
		Emp1.deptno=04;
		Emp1.Desg="Digital Assistant";
		Emp1.display();

		Employee Emp2 =new Employee();// new object Emp2 for Employee class
		Emp2.EId=1002;
		Emp2.EName="super";
		Emp2.sal=15000;
		Emp2.deptno=04;
		Emp2.Desg="Digital Assistant";
		Emp2.display();
		
	}

}
