package Exercise.PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    List<String> contacts = new ArrayList<>();
    List<String> blackList = new ArrayList<>();

    public PhoneBook(List<String> contacts, List<String> blackList) {
        this.contacts = contacts;
        this.blackList = blackList;
    }

    public static List<String> filterContacts(List<String> contacts, List<String> blackList) {
        for (String contact : blackList) {
            if (contacts.contains(contact)) {
                contacts.remove(contact);
            }
        }
        return contacts;
    }

    public void addToBlackList(String blockedContact) {
        if (blackList.contains(blockedContact)) {
            contacts.remove(blockedContact);
        } else {
            blackList.add(blockedContact);
            contacts.remove(blockedContact);
        }
    }

    public void removeFromBlackList(String contact) {
        if (this.blackList.contains(contact)) {
            this.blackList.remove(contact);
            this.contacts.add(contact);
        } else {
            contacts.add(contact);
        }
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public List<String> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }
}
