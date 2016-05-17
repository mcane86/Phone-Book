import java.util.ArrayList;
import java.util.*;

public class Entry {

    List<String> newEntry;

    private String phonenumber;

    public Entry(String phonenumber) {
        this.phonenumber = phonenumber;
        newEntry = new ArrayList<String>();
    }

    public List<String> getNewEntry() {
        return newEntry;
    }

    public void addNumber(String phonenumber) {
        newEntry.add(phonenumber);
    }

    public void removeNumber(int index) {
        newEntry.remove(index-1);

    }

    public String getNumber() {
        return phonenumber;
    }

    public int getNumberOfDefinitions() {
        return newEntry.size();
    }
}
