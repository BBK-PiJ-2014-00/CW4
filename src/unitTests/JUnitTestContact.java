package unitTests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import contactManager.Contact;

/**
 * Unit test to test the ContactImpl class.
 * 
 * @Author ttadde01
 *
 */
public class JunitTestContact {
	
	/**
	 * Array of int used to represent id of contacts
	 */
	private int[] id = {1,2};

	/**
	 * Array of Contact used for testing..
	 */
	private Contact[] contact = new Contact[2];
	
	/**
	 * Array of String used to represent name of contacts.
	 */
	private String[] name = {"Contact name1", "Contact name2"};
	
	/**
	 * Array of String used to represent notes on contacts.
	 */
	private String[] notes = {"Notes on contact 1",  ""};
	
	/**
	 * Initialise array of Contact.
	 */
	@Before
	public void before() {
		this.contact[0] = new ContactImpl(this.id[0],this.name[0],this.notes[0]);
		this.contact[1] = new ContactImpl(this.id[1], this.name[1]);
	}
	
	/**
	 * Test getID of Contact class implementation.
	 */
	@Test
	public void testGetID() {
		int returnedID = contact[0].getId();
		assertEquals(name[0], returnedID);
	}	
	
	/**
	 * Test getName of Contact class implementation.
	 */
	@Test
	public void testGetName() {
		String returnedName = contact[0].getName();
		assertEquals(name[0], returnedName);
	}
	
	/**
	 * Test getNotes of Contact class implementation.
	 */
	@Test
	public void testGetNotes() {
		String returnedNotes = contact[0].getNotes();
		assertEquals(notes[0], returnedNotes);
	}
	
	/**
	 * Test note with empty notes ie "".
	 */
	@Test
	public void testContactWithEmptyNotes() {
		String foundNotes = contact[1].getNotes();
		assertEquals("", foundNotes);
	}
}