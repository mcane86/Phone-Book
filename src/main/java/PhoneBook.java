import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, Entry> phonebook;

    /**
     * This will have to be sorted.
     */
    public PhoneBook() {
        phonebook = new HashMap<String, Entry>();

    }

    public Entry lookupEntry(String name) {
        return phonebook.get(name);
    }

    public void addEntry(String name, Entry theEntry) {
        phonebook.put(name, theEntry);
    }

    public void removeEntry(String theEntry) {
        phonebook.remove(theEntry);
    }

    public String lookupByNumber(String number) {
        String answer = "";
        for(String key: phonebook.keySet()) {
            for(int i = 0; i < phonebook.get(key).getNewEntry().size(); i++) {
                if(phonebook.get(key).getNewEntry().get(i).equals(number)) {
                    answer = key;
                    break;
                }
            }
        }
        return answer;
    }
}
