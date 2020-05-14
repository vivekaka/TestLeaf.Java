package selenium90Days.Java;

import org.testng.annotations.Test;

public class Palindrome {
	@Test
	public void firstMethod() {


		System.out.println("****First method****");

		String str = "malayalam";

		String revrse = "";

		for (int i = str.length()-1; i >= 0; i--) {

			revrse += str.charAt(i);
		}

		if(str.equals(revrse)) {

			System.out.println("Yes, the given string is a palindrome");
		}

		else {

			System.out.println("No, not a palindorme");
		}

	}

	@Test
	public void methodTwo() {

		System.out.println("***Second method***");

		String str = "MALAYALAM";

		String rev = "";

		for (int i = str.length()-1; i >= 0; i--) {

			rev += str.charAt(i);

		}


		System.out.println(str.equals(rev)?"Yes it's a palindrome" : "It''s not a palindrome");

	}


	@Test
	public void thirdMethod() {

		System.out.println("***Third method***");

		String str = "MALAYALAM";

		StringBuffer buffer = new StringBuffer(str).reverse();

		String reversedString = buffer.toString();

		if(str.equalsIgnoreCase(reversedString)) {

			System.out.println("The given string is a palindrome");
		}

		else {

			System.out.println("The given string is not a palindrome");
		}

	}

}













