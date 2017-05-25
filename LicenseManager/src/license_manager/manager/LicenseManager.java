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
	@SuppressWarnings("deprecation")
	public LicenseManager(String pathToFile) {
		try (Scanner fileReader = new Scanner(new FileInputStream(pathToFile), "UTF8")) {
			while (fileReader.hasNext()) {
				Id id = new Id();
				id.setLastName(fileReader.next());
				//System.out.println(id.getLastName());
				id.setFirstName(fileReader.next());
				//System.out.println(id.getFirstName());
				id.setBirthDate(fileReader.next());
				//System.out.println(id.getBirthDate());
				id.setIssuanceDate(fileReader.next());
				//System.out.println(id.getIssuanceDate());
				id.setExpirationDate(fileReader.next());
				//System.out.println(id.getExpirationDate());
				id.setLicenseNumber(fileReader.next());
				//System.out.println(id.getLicenseNumber());

				id.setAddress(fileReader.nextLine());
				System.out.println(id.getAddress());
				id.setLicenseClass(fileReader.next());
				id.setSex(fileReader.next());
				id.setHeight(fileReader.next());
				id.setEyeColor(fileReader.next());
				id.setHairColor(fileReader.next());
				list.add(id);
				process(id);
			}
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
		// System.out.println(id.getLastName());
	}

}
