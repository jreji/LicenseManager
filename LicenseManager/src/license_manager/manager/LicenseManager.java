package license_manager.manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

import license_manager.id.Id;
import license_manager.util.LicenseList;

/**
 * The manager that handles the license files
 * 
 * @author Joel Reji
 * @author Allen Thomas
 */
public class LicenseManager {

	LicenseList<Id> list = new LicenseList<Id>();

	/**
	 * Constructs the LicenseManager with the license file
	 * 
	 * @param pathToFile
	 *            is the file path for the license file
	 */
	public LicenseManager(String pathToFile) {
		try (Scanner fileReader = new Scanner(new FileInputStream(pathToFile), "UTF8")) {
			while (fileReader.hasNextLine()) {
				String getLine = fileReader.nextLine();
				Scanner lineReader = new Scanner(getLine);
				Id id = new Id();
				id.setLastName(lineReader.next());
				id.setFirstName(lineReader.next());
				id.setBirthDate(lineReader.next());
				id.setIssuanceDate(lineReader.next());
				id.setExpirationDate(lineReader.next());
				id.setLicenseNumber(lineReader.next());
				list.add(id);
				process(id);
				lineReader.close();
			}

			// id.setLicenseNumber(fileReader.next());
			// // System.out.println(id.getLicenseNumber());
			// String getLine = fileReader.nextLine();
			// Scanner lineReader = new Scanner(getLine);
			// lineReader.useDelimiter("\\W+\\s*");
			// id.setAddress(lineReader.next());
			// // System.out.println(id.getAddress());
			// id.setLicenseClass(fileReader.next());
			// id.setSex(fileReader.next());
			// id.setHeight(fileReader.next());
			// id.setEyeColor(fileReader.next());
			// id.setHairColor(fileReader.next());
			// fileReader.next();
			// list.add(id);
			// process(id);
			// }
			fileReader.close();
		} catch (FileNotFoundException e) {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Takes the list of Id's and does the manager process
	 * 
	 * @param id
	 *            is the id passed in
	 */
	private void process(Id id) {
		System.out.println(id.getLastName());
		System.out.println(id.getFirstName());
		System.out.println(id.getBirthDate());
		System.out.println(id.getIssuanceDate());
		System.out.println(id.getExpirationDate());
		System.out.println(id.getLicenseNumber());
	}

}
