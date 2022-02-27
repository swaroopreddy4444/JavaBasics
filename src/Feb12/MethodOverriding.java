package Feb12;

class Bank{
	double RoI() {
		return 0;
	}
}

class SBI{	
	double RoI() {
		return 7.5;
	}
}

class HDFC{	
	double RoI() {
		return 12.5;
	}
}

class AXIS{	
	double RoI() {
		return 9.5;
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		
		SBI sbi=new SBI();
		System.out.println("SBI RoI = "+sbi.RoI());
		HDFC hc=new HDFC();
		System.out.println("HDFC RoI = "+hc.RoI());
		AXIS as=new AXIS();
		System.out.println("AXIS RoI = "+as.RoI());
	}
}
