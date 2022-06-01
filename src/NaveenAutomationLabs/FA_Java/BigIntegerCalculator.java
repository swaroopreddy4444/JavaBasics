package NaveenAutomationLabs.FA_Java;

import java.math.BigInteger;

public class BigIntegerCalculator {

	public static void main(String[] args) {

		BigInteger n1=new BigInteger("987654321");
		BigInteger n2=new BigInteger("999999999");

		System.out.println(n2.add(n1));

		System.out.println(n2.subtract(n1));

		System.out.println(n2.multiply(n1));

		System.out.println(n2.divide(n1));
		
	}
	

}
