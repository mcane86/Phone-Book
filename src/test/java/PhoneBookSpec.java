
import org.junit.Test;


import java.util.Set;

import static org.junit.Assert.*;

public class PhoneBookSpec {

    @Test
    public void testAddEntry() {
        PhoneBook phoneBook = new PhoneBook();
        String expectedEntry = "8675309";
        Entry theEntry = new Entry(expectedEntry);
        phoneBook.addEntry(expectedEntry, theEntry);
        String actualEntry = phoneBook.lookupEntry(expectedEntry).getNumber();
        assertTrue("Should output 8675309", expectedEntry.equals(actualEntry));
    }

    @Test
    public void testRemoveEntry() {
        PhoneBook phoneBook = new PhoneBook();
        String expectedEntry = "8675309";
        phoneBook.addEntry(expectedEntry, new Entry(expectedEntry));
        Entry resultBeforeRemoval = phoneBook.lookupEntry(expectedEntry);
        phoneBook.removeEntry(expectedEntry);
        Entry resultAfterRemoval = phoneBook.lookupEntry(expectedEntry);
        assertNull(resultAfterRemoval);
        assertNotEquals(resultBeforeRemoval, resultAfterRemoval);
    }

    @Test
    public void testLookupEntry() {
        PhoneBook phoneBook =  new PhoneBook();
        String newEntry = "Tommy Tutone";
        phoneBook.addEntry(newEntry, new Entry("8675309"));
        assertNotNull(phoneBook.lookupEntry(newEntry));
    }

    @Test
    public void testLookupByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        Entry test = new Entry("8675309");
        test.addNumber("8675309");
        String expectedValue = "Tommy Tutone";
        phoneBook.addEntry(expectedValue,test);
        String actualValue = phoneBook.lookupByNumber("8675309");
        assertEquals(expectedValue, actualValue);
    }
}
