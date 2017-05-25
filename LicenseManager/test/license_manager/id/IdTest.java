package license_manager.id;

import static org.junit.Assert.*;

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
	@Test
	public void testId() {
		Id joelId = new Id("Reji", "Joel", "03-28-1997", "10-15-2015", "03-28-2023", "31875062",
				"1200 JUSTICE WALK AVE MORRISVILLE NC 27560-5300", "C", "M", "5-11", "BRO", "BLK");
		assertEquals(joelId.getLastName(), "Reji");
		joelId.setLastName("Thomas");
		assertEquals(joelId.getFirstName(), "Joel");
		joelId.setFirstName("Allen");
		assertEquals(joelId.getBirthDate(), "03-28-1997");
		joelId.setBirthDate("03-28-1998");
		assertEquals(joelId.getIssuanceDate(), "10-15-2015");
		joelId.setIssuanceDate("10-12-2015");
		assertEquals(joelId.getExpirationDate(), "03-28-2023");
		joelId.setExpirationDate("03-28-2021");
		assertEquals(joelId.getLicenseNumber(), "31875062");
		joelId.setLicenseNumber("123456");
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
