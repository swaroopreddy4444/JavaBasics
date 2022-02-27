package Assignments;

public class AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{2,3,8},{1,4,5}};
		int [][]b= {{1,6,-1},{-4,7,-2}};
		int [][]c=new int[2][3];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {

				c[i][j]=a[i][j]+b[i][j];	
			}
		}
		for(int x[]:a) {
			for(int i:x) {
				System.out.printf("%3d",i);;
			}
			System.out.println();
		}
		System.out.println("     +");
		for(int x[]:b) {
			for(int i:x) {
				System.out.printf("%3d",i);
			}
			System.out.println();
		}
		System.out.println("-----------");
		for(int x[]:c) {
			for(int i:x) {
				System.out.printf("%3d",i);;
			}
			System.out.println();
		}
	}

}
