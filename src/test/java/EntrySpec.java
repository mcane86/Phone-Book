import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EntrySpec {

    String testName = "Tommy Tutone";

    @Test
    public void testAddNumber() {
        Entry entry = new Entry(testName);
        entry.addNumber("8675309");

        int expectedNumberOfDefinitions = 1;
        int actualNumberOfDefinitions = entry.getNumberOfDefinitions();
        assertEquals("Should each output 1", expectedNumberOfDefinitions, actualNumberOfDefinitions);

    }

    @Test
    public void testRemoveNumber() {
        Entry entry = new Entry(testName);
        entry.addNumber("8675309");
        entry.removeNumber(1);

        int expectedNumberOfDefinitions = 0;
        int actualNumberOfDefinition = entry.getNumberOfDefinitions();
        assertEquals("Should each output 0", expectedNumberOfDefinitions, actualNumberOfDefinition);

    }
}
