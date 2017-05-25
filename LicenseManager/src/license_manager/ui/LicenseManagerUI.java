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
		LicenseManager manager = new LicenseManager(database);
		reader.close();
	}
}
