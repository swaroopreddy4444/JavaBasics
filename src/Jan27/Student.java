package Jan27;

public class Student {
	
	int sid;
	String sname;
	char Grade;
	
	Student(int id,String name,char g)
	{
		sid=id;
		sname=name;
		Grade=g;
		
	}

//	void getvalues(int id,String name,char g)
//	{
//		sid=id;
//		sname=name;
//		Grade=g;
//		
//	}

	void display()
	{
		System.out.println(sid+"\t"+sname+"\t"+Grade);
	}

}
