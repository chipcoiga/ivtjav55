package collectionsdemo.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();

        Contact contact1 = new Contact("Loc1", "lhloc@gmail.com", "1234545756");
        Contact contact2 = new Contact("Loc2", "lhloc@gmail.com", null);
        Contact contact3 = new Contact("Loc3", "lhloc@gmail.com", null);
        Contact contact4 = new Contact("Loc4", "lhloc@gmail.com", "1234545756");

        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);

        List<Contact> noPhoneContact = getContacts(contacts, contact -> contact.getPhone() == null);

        System.out.println(noPhoneContact.size());
    }

    private static List<Contact> getContacts(List<Contact> contacts, TestContact testContact) {
        List<Contact> noPhoneContact = new ArrayList<>();
        for (Contact contact : contacts) {
            if (testContact.test(contact)) {
                noPhoneContact.add(contact);
            }
        }
        return noPhoneContact;
    }
}

interface TestContact {
    boolean test(Contact c);
}
