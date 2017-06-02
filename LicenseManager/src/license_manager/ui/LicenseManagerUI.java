package license_manager.ui;

import java.util.Scanner;

import license_manager.manager.LicenseManager;

/**
 * A console based UI for testing purposes
 * 
 * @author Joel Reji
 * @author Allen Thomas
 *
 */
public class LicenseManagerUI {

	/**
	 * Main method to test the program
	 * 
	 * @param args
	 *            is the arguments passed into the program
	 */
	public static void main(String[] args) {
		System.out.print("License Databasse: ");
		Scanner reader = new Scanner(System.in);
		String database = reader.next();
		System.out.println("Loading Program......");
		LicenseManager manager = new LicenseManager(database);
		System.out.println("Program Ready!");
		System.out.println("------------------------------------------------------------");
		System.out.println("Please enter the following values for the Fake ID checker.");
		System.out.print("First Name: ");
		Scanner first = new Scanner(System.in);
		String fName = reader.next();
		System.out.print("Last Name: ");
		Scanner last = new Scanner(System.in);
		String lName = reader.next();
		System.out.print("License Number: ");
		Scanner number = new Scanner(System.in);
		String num = reader.next();
		System.out.println("--------------------------------------------------------------");
		manager.process(fName, lName, num);
		first.close();
		last.close();
		number.close();
		reader.close();
	}
}
