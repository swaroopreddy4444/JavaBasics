package Feb13.Vishal;

class StudentStrength {
	int Total() {
		return 240;
	}
	
}

class FirstYear extends StudentStrength{
	int Total() {
		return 140;
	}
	
}

class SecondYear extends StudentStrength{
	int Total() {
		return 60;
	}
	
}

class FinalYear extends StudentStrength{
	int Total() {
		return 40;
	}
}	

public class Si{

	public static void main(String[] args) {
		
		StudentStrength tot=new StudentStrength();
		System.out.println(tot.Total());
		
		FirstYear tot1=new FirstYear();
		System.out.println(tot1.Total());
		StudentStrength tot2=new SecondYear();
		System.out.println(tot2.Total());
		StudentStrength tot3=new FinalYear();
		System.out.println(tot3.Total());
	}
}