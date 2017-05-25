package license_manager.util;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the License List class
 * 
 * @author Joel Reji
 * @author Allen Thomas
 *
 */
public class LicenseListTest {

	/**
	 * Tests the constructor of License List
	 */
	@Test
	public void testLicenseList() {
		LicenseList<String> list = new LicenseList<String>();
		list.add("Joel");
		assertEquals(list.size(), 1);
		list.add(1, "Allen");
		assertEquals(list.get(1), "Allen");
		assertTrue(list.contains("Joel"));
		assertEquals(list.indexOf("Allen"), 1);
		assertEquals(list.indexOf("nothing"), -1);
		list.remove(1);
	}

	/**
	 * Tests the add method
	 */
	@Test
	public void testAddE() {
		LicenseList<String> list = new LicenseList<String>();
		assertFalse(list.contains("Joel"));
		list.add("Joel");
		try {
			list.add(null);
			fail();
		} catch (NullPointerException e) {
			assertEquals(list.size(), 1);
		}
		list.add("Allen");
		list.add("Jamie");
		list.add("Jisha");
	}

	/**
	 * Test the get method
	 */
	@Test
	public void testGet() {
		LicenseList<String> list = new LicenseList<String>();
		assertFalse(list.contains("Joel"));
		list.add("Joel");
		try {
			list.get(-1);
			fail();
		} catch (IndexOutOfBoundsException e) {
			assertEquals(list.size(), 1);
		}

		try {
			list.get(10);
			fail();
		} catch (IndexOutOfBoundsException e) {
			assertEquals(list.size(), 1);
		}

	}

	/**
	 * Test the add at index method
	 */
	@Test
	public void testAddIntE() {
		LicenseList<String> list = new LicenseList<String>();
		assertFalse(list.contains("Joel"));
		list.add("Joel");
		try {
			list.add(0, null);
			fail();
		} catch (NullPointerException e) {
			assertEquals(list.size(), 1);
		}

		try {
			list.add(-1, "Joel");
			fail();
		} catch (IndexOutOfBoundsException e) {
			assertEquals(list.size(), 1);
		}

		try {
			list.add(10, "Joel");
			fail();
		} catch (IndexOutOfBoundsException e) {
			assertEquals(list.size(), 1);
		}
		list.add(0, "Jamie");
		assertFalse(list.contains("Allen"));
	}

	/**
	 * Tests the remove method
	 */
	@Test
	public void testRemove() {
		LicenseList<String> list = new LicenseList<String>();
		assertFalse(list.contains("Joel"));
		list.add("Joel");
		try {
			list.remove(-1);
			fail();
		} catch (IndexOutOfBoundsException e) {
			assertEquals(list.size(), 1);
		}

		try {
			list.remove(10);
			fail();
		} catch (IndexOutOfBoundsException e) {
			assertEquals(list.size(), 1);
		}
		list.add(0, "Jamie");
		assertFalse(list.contains("Allen"));
		list.remove(0);
		list.add("Angel");
		list.add("Baller");
		list.remove(1);
	}

}
