package selenium90Days.Java;

import org.testng.annotations.Test;

public class Occurance {

	@Test
	private void firstMethod() {

		System.out.println("***First method***");

		String str = "You have no choice other than following me!";

		int occurence = 0;

		for (int i = 0; i < str.length(); i++) {

			if(str.charAt(i) == 'o') {

				occurence = occurence + 1;
			}
		}

		System.out.println("The number of o occurance is :"+ occurence);


	}

	@Test
	private void methodTwo() {

		System.out.println("***Second method***");

		String str = "You have no choice other than following me!";

		String replaceAll = str.replaceAll("[^o]", "");

		System.out.println("The number of occurence of o is :"+ replaceAll.length());



	}

	@Test
	private void methodThree() {

		System.out.println("***Third method***");

		String str = "You have no choice other than following me!";

		char[] charArray = str.toCharArray();

		int occurence = 0;

		for (int i = 0; i < charArray.length; i++) {

			if (charArray[i] == 'o') {

				occurence++;
			}

		}
		
		System.out.println("The number of o occurance is :"+ occurence);

	}


}


