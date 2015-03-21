package unitTests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import contactManager.Contact;

/**
 * Unit test to test the ContactImpl class.
 * 
 * @author Vasco
 *
 */
public class UnitTestContact {
	
	/**
	 * Array of int used to represent id of contacts
	 */
	private int[] id = {1,2,3};

	/**
	 * Array of Contact used for testing..
	 */
	private Contact[] contact = new Contact[3];
	
	/**
	 * Array of String used to represent name of contacts.
	 */
	private String[] name = {"Contact name1", "Contact name2", "Contact name3"};
	
	/**
	 * Array of String used to represent notes on contacts.
	 */
	private String[] notes = {"Notes on contact 1", "Notes on contact2", ""};
	
	/**
	 * Initialise array of Contact.
	 */
	@Before
	public void before() {
		this.contact[0] = new ContactImpl(this.id[0],this.name[0],this.notes[0]);
		this.contact[1] = new ContactImpl(this.id[1], this.name[1],this.notes[1]);
		this.contact[2] = new ContactImpl(this.id[2], this.name[2]);
	}
	
	/**
	 * Test getID of Contact class implementation.
	 */
	@Test
	public void testGetID() {
		String returnedID = contact[0].getName();
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
	 * Test that the notes are empty.
	 */
	@Test
	public void testContactWithEmptyNotes() {
		String foundNotes = contact[4].getNotes();
		assertEquals("", foundNotes);
	}
}