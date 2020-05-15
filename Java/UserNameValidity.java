package selenium90Days.Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidity {

	public static void main(String[] args) {


		String str = "Billgates@123#";

		String namePattern = "[a-zA-Z0-9@#_]{8,}";

		Pattern pattern = Pattern.compile(namePattern);

		Matcher matcher = pattern.matcher(str);	
		
		System.out.println(matcher.matches());

	}

}
