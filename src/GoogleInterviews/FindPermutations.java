package GoogleInterviews;

public class FindPermutations {

	public static void main(String[] args) {

		String BigString = "cbabcacabca";
		String SmallString = "cab";

		for (int i = 0; i <= BigString.length() - SmallString.length(); i++) {
			String temp = BigString.substring(i, i + SmallString.length());
			boolean flag = true;
			for (int j = 0; j < temp.length(); j++) {
				if (!temp.contains(SmallString.charAt(j) + "")) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(temp);
			}
		}
	}
}