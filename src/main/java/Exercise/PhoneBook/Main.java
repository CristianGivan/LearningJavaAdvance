package Exercise.PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> contacts=new ArrayList<>();
        List<String> blackList=new ArrayList<>();
        contacts.add("a");
        contacts.add("b");
        contacts.add("c");
        contacts.add("d");
        contacts.add("e");
        blackList.add("d");
        blackList.add("b");
        System.out.println(contacts);
        System.out.println(blackList);
        PhoneBook.filterContacts(contacts,blackList);
        System.out.println(contacts);
        PhoneBook phoneBook=new PhoneBook(contacts,blackList);
        phoneBook.addToBlackList("e");
        System.out.println(contacts);
        phoneBook.removeFromBlackList("e");
        System.out.println(contacts);
    }
}
