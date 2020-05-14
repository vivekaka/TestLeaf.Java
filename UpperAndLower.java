package selenium90Days.Java;

public class UpperAndLower {

	public static void main(String[] args) {

		String str = "1. It's Work from Home not Work for Home";

		char[] charArray = str.toCharArray();

		int upper =0, lower =0, space =0, number =0; 

		for (int j = 0; j < charArray.length; j++) 
		{


			if(charArray[j] == ' ') {

				space++;
			}

			else if(Character.isUpperCase(charArray[j])) 
			{

				upper++;

			}

			else if(Character.isLowerCase(charArray[j]))
			{
				lower++;

			}

			else if (Character.isDigit(charArray[j])) {

				number++;

			}
		}

		System.out.println("Uppercase :"+ upper);

		System.out.println("Lowercase :"+ lower);

		System.out.println("Space :"+ space);

		System.out.println("Numbers :"+ number);



	}

}
