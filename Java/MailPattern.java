package selenium90Days.Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailPattern {

	public static void main(String[] args) {

		String str = "balaji_chandrasekaran@testleaf.co.uk";
		
		String mailPattern = "[a-zA-Z0-9_&.]+@[a-zA-z]+.[a-z]+.[a-z]{2,}";

		Pattern compiLE = Pattern.compile(mailPattern);
		
		Matcher matcher = compiLE.matcher(str);
		
		System.out.println(matcher.matches());
		



	}

}
