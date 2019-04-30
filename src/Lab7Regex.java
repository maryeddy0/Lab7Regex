import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab7Regex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		NAMING AN IDENTIFIER
//		Start each identifier with a letter, underscore, or dollar sign. Use letters, dollar sign, underscores, or digits for subsequent characters.
//		Use no more than 255 characters.
//		Don't use Java keywords.

		
		// Name check
		System.out.println("Please enter a valid name");
		String input = sc.next();
		
		boolean pattern = isValidEmail(input, "\\b[A-Z][a-z]*\\b");
		if(!pattern) {System.out.println("Sorry, name is not valid");
		}else {System.out.println("name is valid");}
		
		//Email check
		System.out.println("Please enter a valid email");
		String input1 =sc.next();
		
		boolean pattern1 = isValidEmail(input1, "([a-z]{5,30})+@([a-z]{5,10})+.([a-z]{2,3})");
		if(!pattern1) {System.out.println("Sorry, email is not valid");
		}else {System.out.println("email is valid");}

		//Phone #
		System.out.println("Please enter a valid phone number ");
		String input2 =sc.next();
		
		boolean pattern2 = isValidEmail(input2, "\\d{3}-\\d{3}-\\d{4}");
		if(!pattern2) {System.out.println("Sorry, Phone is not valid");
		}else {System.out.println("Phone is valid");}
		
		//Date (dd/mm/yyyy)
		System.out.println("Please enter a valid date");
		String input3 =sc.next();
		
		boolean pattern3 = isValidEmail(input3, "\\d{2}/\\d{2}/\\d{4}");
		if(!pattern3) {System.out.println("Sorry, date is not valid");
		}else {System.out.println("Date is valid");}
		
		
		
		
		}
		public static boolean isValidEmail(String input2, String regex) {    
			String emailPattern = regex;
	        String input = input2;
	        Pattern p = Pattern.compile(emailPattern);
	        Matcher m = p.matcher(input);
	        return m.matches();
			
	}
}

