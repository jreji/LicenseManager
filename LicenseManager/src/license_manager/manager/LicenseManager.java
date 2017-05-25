package license_manager.manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The manager that handles the license files
 * 
 * @author Joel Reji
 * @author Allen Thomas
 */
public class LicenseManager {

	/**
	 * Constructs the LicenseManager with the license file
	 * 
	 * @param pathToFile
	 *            is the file path for the license file
	 */
	public LicenseManager(String pathToFile) {
		try (Scanner fileReader = new Scanner(new FileInputStream(pathToFile), "UTF8")) {
			while (fileReader.hasNext()) {
				// String word = fileReader.next();
				// hash.addToTable(word);
			}
		} catch (FileNotFoundException e) {
			throw new IllegalArgumentException();
		}
	}

}
