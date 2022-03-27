package FA_Java_Programs;

public class RemoveSpecialChar {

	public static void main(String[] args) {

		String str="*@)S@(w*a#r#o*op@ r#e!d^!dy 4#(*4_)Ω4@§4å";
		System.out.println(str);
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
			
	}

}
