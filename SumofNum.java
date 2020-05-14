package selenium90Days.Java;

import org.testng.annotations.Test;

public class SumofNum {
	@Test
	public void methodOne() {

		System.out.println("***First method***");

		String str = " asdf1qwer9as8d7";

		String replaceAll = str.replaceAll("\\D", "");

		int inputNum = Integer.parseInt(replaceAll);

		int sum = 0;

		while(inputNum > 0) {

			int remain = inputNum%10;

			inputNum =  inputNum/10;

			sum = sum + remain;
		}

		System.out.println("Sum of the numbers is :"+sum);

	}

	@Test
	private void methodTwo() {

		System.out.println("***Second method***");

		String str = " asdf1qwer9as8d7";

		String repLCE = str.replaceAll("[^0-9]", "");

		int intNum = Integer.parseInt(repLCE);

		int sum = 0;

		while(intNum > 0) {

			int remain = intNum%10;

			intNum = intNum/10;

			sum = sum + remain;
		}

		System.out.println("The sum of the digits are :"+sum);

	}


}





