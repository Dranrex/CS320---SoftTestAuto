package Contact;

import java.util.ArrayList;
import java.util.Iterator;

public class ContactService {
    public ArrayList<Contact> contactList = new ArrayList<>();

    public void displayContactList() {
        for (Contact contact : contactList) {
            System.out.println("\t Contact ID: " + contact.getContactID());
            System.out.println("\t First Name: " + contact.getFirstName());
            System.out.println("\t Last Name: " + contact.getLastName());
            System.out.println("\t Phone Number: " + contact.getNumber());
            System.out.println("\t Address: " + contact.getAddress() + "\n");
        }
    }

    public void addContact(String firstName, String lastName, String number, String address) {
        Contact contact = new Contact(firstName, lastName, number, address);
        contactList.add(contact);
    }

    public Contact getContact(String contactID) {
        for (Contact contact : contactList) {
            if (contact.getContactID().toString().equals(contactID)) {
                return contact;
            }
        }
        return null; // Return null if contact is not found
    }

    public void deleteContact(String contactID) {
        Iterator<Contact> iterator = contactList.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getContactID().toString().equals(contactID)) {
                iterator.remove();
                return;
            }
        }
        System.out.println("Contact ID: " + contactID + " not found.");
    }

    public void updateFirstName(String updatedString, String contactID) {
        for (Contact contact : contactList) {
            if (contact.getContactID().toString().equals(contactID)) {
                contact.setFirstName(updatedString);
                return;
            }
        }
        System.out.println("Contact ID: " + contactID + " not found.");
    }

    public void updateLastName(String updatedString, String contactID) {
        for (Contact contact : contactList) {
            if (contact.getContactID().toString().equals(contactID)) {
                contact.setLastName(updatedString);
                return;
            }
        }
        System.out.println("Contact ID: " + contactID + " not found.");
    }

    public void updateNumber(String updatedString, String contactID) {
        for (Contact contact : contactList) {
            if (contact.getContactID().toString().equals(contactID)) {
                contact.setNumber(updatedString);
                return;
            }
        }
        System.out.println("Contact ID: " + contactID + " not found.");
    }

    public void updateAddress(String updatedString, String contactID) {
        for (Contact contact : contactList) {
            if (contact.getContactID().toString().equals(contactID)) {
                contact.setAddress(updatedString);
                return;
            }
        }
        System.out.println("Contact ID: " + contactID + " not found.");
    }
}
