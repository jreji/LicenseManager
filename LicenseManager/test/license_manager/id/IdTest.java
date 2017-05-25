package license_manager.id;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

/**
 * Tests the id class
 * 
 * @author Joel Reji
 * @author Allen Thomas
 *
 */
public class IdTest {

	/**
	 * Tests the constructor
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testId() {
		Date dob = new Date(1997, 03, 28);
		Date issuance = new Date(2015, 10, 17);
		Date expiration = new Date(2023, 03, 28);
		Id joelId = new Id("Reji", "Joel", dob, issuance, expiration, 31875062,
				"1200 JUSTICE WALK AVE MORRISVILLE NC 27560-5300", "C", "M", "5-11", "BRO", "BLK");
		assertEquals(joelId.getLastName(), "Reji");
		joelId.setLastName("Thomas");
		assertEquals(joelId.getFirstName(), "Joel");
		joelId.setFirstName("Allen");
		assertEquals(joelId.getBirthDate(), dob);
		Date ndob = new Date(1997, 04, 29);
		joelId.setBirthDate(ndob);
		assertEquals(joelId.getIssuanceDate(), issuance);
		Date iss = new Date(1997, 04, 29);
		joelId.setIssuanceDate(iss);
		assertEquals(joelId.getExpirationDate(), expiration);
		Date exp = new Date(2014, 04, 29);
		joelId.setExpirationDate(exp);
		assertEquals(joelId.getLicenseNumber(), 31875062);
		joelId.setLicenseNumber(123456);
		assertEquals(joelId.getAddress(), "1200 JUSTICE WALK AVE MORRISVILLE NC 27560-5300");
		joelId.setAddress("1500 JOEL LANE");
		assertEquals(joelId.getLicenseClass(), "C");
		joelId.setLicenseClass("M");
		assertEquals(joelId.getSex(), "M");
		joelId.setSex("F");
		assertEquals(joelId.getHeight(), "5-11");
		joelId.setHeight("4-11");
		assertEquals(joelId.getEyeColor(), "BRO");
		joelId.setEyeColor("BLK");
		assertEquals(joelId.getHairColor(), "BLK");
		joelId.setHairColor("BRO");
	}
}
