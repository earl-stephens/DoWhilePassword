package application;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		/* Coding challenge
		 * Use a do while loop to ask for a user's password,
		 * compare the password to the stored one,
		 * output Access granted if the password is correct
		 * or output Enter password if the wrong password is entered
		 */
		
		final String PASSWORD = "secure";
		
		Scanner scanner = new Scanner(System.in);
		String userInput = null;
		
		do {
			System.out.println("Enter your password: ");
			userInput = scanner.nextLine();
		} while(!userInput.equals(PASSWORD));
		
		System.out.println("Access granted");
		scanner.close();
	}

}
