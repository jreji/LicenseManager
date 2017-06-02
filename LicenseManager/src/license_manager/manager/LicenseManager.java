package license_manager.manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
				id.setAddress(lineReader.next());
				id.setLicenseClass(lineReader.next());
				id.setSex(lineReader.next());
				id.setHeight(lineReader.next());
				id.setEyeColor(lineReader.next());
				id.setHairColor(lineReader.next());
				list.add(id);
				lineReader.close();
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Does the actual fake ID checking and returns if the ID is fake or not
	 * 
	 * @param firstName
	 *            is the first name
	 * @param lastName
	 *            is the last name
	 * @param licenseNumber
	 *            is the license number
	 */
	public void process(String firstName, String lastName, String licenseNumber) {
		boolean found = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getFirstName().equalsIgnoreCase(firstName)
					&& list.get(i).getLastName().equalsIgnoreCase(lastName)
					&& list.get(i).getLicenseNumber().equalsIgnoreCase(licenseNumber)) {
				found = true;
				break;
			}
		}
		if (found == true) {
			System.out.println("ID Verfied!");
		} else {
			System.out.println("FAKE ID.");
		}
	}

}
