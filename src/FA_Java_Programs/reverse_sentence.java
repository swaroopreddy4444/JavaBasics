package FA_Java_Programs;

public class reverse_sentence {


		public static void main(String args[]){


		String str="swaroop is QA";

		String[] list = str.split(" ");
		int len = list.length;
		String newstr="";
		for(int i=len-1;i>=0;i--) {
		newstr+=list[i]+" ";
		}
		System.out.println(newstr.trim());

		}
}
