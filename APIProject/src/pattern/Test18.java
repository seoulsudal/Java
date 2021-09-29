package pattern;

import java.util.regex.Pattern;

public class Test18 {

	public static void main(String[] args) {

		String firstName = "Oh";
		String lastName = "Jung-Im";
		String tel = "010-1234-5678";
		String email = "purum@ruby.com";
		
		boolean firstName_check = Pattern.matches("[A-Z][a-zA-Z]*", firstName);
		boolean lastName_check = Pattern.matches("[a-zA-z]+(['-][a-zA-z]+)*", lastName);
		
		String tel_pat = "01[0-9]-\\d{3,4}-\\d{4}";
		String email_pat = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		boolean tel_check = Pattern.matches(tel_pat, tel);
		boolean email_check = Pattern.matches(email_pat, email);
		
		System.out.println("firstName : " + firstName_check);
		System.out.println("lastName : " + lastName_check);
		System.out.println("tel : " + tel_check);
		System.out.println("email : " + email_check);
	}

}
