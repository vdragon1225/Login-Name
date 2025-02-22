import java.util.Scanner; // import Scanner Class

public class Main {

	public static void main(String[] args) {
        // Declare Scanner
		Scanner scan = new Scanner(System.in); 

        // Declare variables
        String firstName, lastName, userName;
		int number;

        // Prompt user for first name
        System.out.print("Enter your first name: ");
		firstName = scan.next(); // Read first name

        // Prompt user for last name
        System.out.print("Enter your last name: ");
		lastName = scan.next(); // Read last name

        // Prompt user for four-digit number
        System.out.print("Enter a four-digit number: ");
		number = scan.nextInt(); // Read four-digit number

        // Generate user name
        // If first name is less than 6 characters, use it as is
		if (firstName.length() < 6) {
			userName = firstName + lastName.charAt(0) + "_" + (number % 10);
		}
		else { // If first name is 6 or more characters, use first 6 characters
			userName = firstName.substring(0, 6) + lastName.charAt(0) + "_" + (number % 10);
		}
		
        // Print user name
		System.out.println("Your login name: " + userName);

        // Close scanner
        scan.close();
	}
}