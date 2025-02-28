package com.test;
import java.util.regex.*;
public class RegEx {

	public static void main(String[] args) {
		Pattern formatD=Pattern.compile(".s");
		Matcher matchD=formatD.matcher("bs");
		boolean b=matchD.matches();
		System.out.println(b);
		boolean b1=Pattern.compile(".s").matcher("data").matches();
		boolean b2=Pattern.matches("..s", "abs");
		System.out.println(b2);//true
		System.out.println(b1);//false
		
		System.out.println(Pattern.matches("[a-z]", "jkl"));
		System.out.println(Pattern.matches("[9]{1}[0-9]{9}", "jkl"));

	}
	public boolean validEmail(String email) {
		boolean validateEmail=Pattern.matches("[_a-zA-Z0-9]+(\\.[A-Za-z0-9]*)*@[a-zA-Z0-9]+(\\.[A-Za-z0-9]*)*", email); 
		return validateEmail;
	}
	public boolean validatePassword(String password) {
		String patternP="(?=.*[0=9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&%!])(?=\\S+$).{12,}";
		boolean passwordValidate=Pattern.matches(patternP, password);
		return passwordValidate;
	}

}
