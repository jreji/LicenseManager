package license_manager.id;

/**
 * The id object with pertinent fields
 * 
 * @author Joel Reji
 * @author Allen Thomas
 */
public class Id {

	/** The last name on the license */
	private String lastName;
	/** The first name on the license */
	private String firstName;
	/** The date of birth on the license */
	private String birthDate;
	/** The date of issuance on the license */
	private String issuanceDate;
	/** The expiration date on the license */
	private String expirationDate;
	/** The license number on the license */
	private String licenseNumber;
	/** The address on the license */
	private String address;
	/** The class character on the license */
	private String licenseClass;
	/** The sex on the license */
	private String sex;
	/** The height on the license */
	private String height;
	/** The eye color on the license */
	private String eyeColor;
	/** The hair color on the license */
	private String hairColor;

	/**
	 * Creates an id constructor which initializes all necessary id fields
	 * 
	 * @param lastName
	 *            is the last name on the license
	 * @param firstName
	 *            is the first name on the license
	 * @param brithDate
	 *            is the birth date on the license
	 * @param issuanceDate
	 *            is the date of issuance on the license
	 * @param expirationDate
	 *            is the expiration date on the license
	 * @param licenseNumber
	 *            is the license number on the license
	 * @param address
	 *            is the address on the license
	 * @param licenseClass
	 *            is the class on the license
	 * @param sex
	 *            is the sex on the license
	 * @param height
	 *            is the height on the license
	 * @param eyeColor
	 *            is the eye color on the license
	 * @param hairColor
	 *            is the hair color on the license
	 */
	public Id(String lastName, String firstName, String birthDate, String issuanceDate, String expirationDate,
			String licenseNumber, String address, String licenseClass, String sex, String height, String eyeColor,
			String hairColor) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.issuanceDate = issuanceDate;
		this.expirationDate = expirationDate;
		this.licenseNumber = licenseNumber;
		this.address = address;
		this.licenseClass = licenseClass;
		this.sex = sex;
		this.height = height;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
	}

	/**
	 * Constructor so that id can be empty
	 */
	public Id() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the brithDate
	 */
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * @param brithDate
	 *            the brithDate to set
	 */
	public void setBirthDate(String brithDate) {
		this.birthDate = brithDate;
	}

	/**
	 * @return the issuanceDate
	 */
	public String getIssuanceDate() {
		return issuanceDate;
	}

	/**
	 * @param issuanceDate
	 *            the issuanceDate to set
	 */
	public void setIssuanceDate(String issuanceDate) {
		this.issuanceDate = issuanceDate;
	}

	/**
	 * @return the expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate
	 *            the expirationDate to set
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * @return the licenseNumber
	 */
	public String getLicenseNumber() {
		return licenseNumber;
	}

	/**
	 * @param licenseNumber
	 *            the licenseNumber to set
	 */
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the licenseClass
	 */
	public String getLicenseClass() {
		return licenseClass;
	}

	/**
	 * @param licenseClass
	 *            the licenseClass to set
	 */
	public void setLicenseClass(String licenseClass) {
		this.licenseClass = licenseClass;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	/**
	 * @return the eyeColor
	 */
	public String getEyeColor() {
		return eyeColor;
	}

	/**
	 * @param eyeColor
	 *            the eyeColor to set
	 */
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	/**
	 * @return the hairColor
	 */
	public String getHairColor() {
		return hairColor;
	}

	/**
	 * @param hairColor
	 *            the hairColor to set
	 */
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
}
