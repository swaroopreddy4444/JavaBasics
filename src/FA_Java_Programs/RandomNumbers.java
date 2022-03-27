package FA_Java_Programs;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random rand=new Random();
		int x=rand.nextInt(1,10);
		System.out.println(x);

		double y=rand.nextDouble(1.5,2.5);
		System.out.println(y);
		
		System.out.println(Math.random());

		// Apache common lang API
		
		String xdigitnum =RandomStringUtils.randomNumeric(8);
		System.out.println(xdigitnum);
		String xlenstr =RandomStringUtils.randomAlphabetic(8);
		System.out.println(xlenstr);
		String xlenpass =RandomStringUtils.randomAlphanumeric(8);
		System.out.println(xlenpass);
	}
}
