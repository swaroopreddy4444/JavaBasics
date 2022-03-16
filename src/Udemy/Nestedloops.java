package Udemy;

public class Nestedloops {

	public static void main(String[] args) {

		int i=0;
		while (i<2) {
			for(int j=0;j<2;j++) {
				int k=0;
				do {
					for (int l=0;l<2;l++) {
						System.out.println(i+" "+j+" "+k+" "+l);	
					}
					k++;
				}while(k<2);
			}		
			i++;
		}
	}
}
