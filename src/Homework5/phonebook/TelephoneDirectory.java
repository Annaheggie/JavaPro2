package Homework5.phonebook;

import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectory {
    private List<Record> phoneBook;

    public TelephoneDirectory() {
        phoneBook = new ArrayList<>();
    }

    public void add(Record entry) {
        phoneBook.add(entry);
    }

    public Record find(String name) {
        for (Record record : phoneBook) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : phoneBook) {
            if (record.getName().equals(name)) {
                foundRecords.add(record);
            }
        }
        return foundRecords.isEmpty() ? null : foundRecords;
    }
}