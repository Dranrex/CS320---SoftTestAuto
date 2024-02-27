package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import Contact.ContactService;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest {

    @Test
    @DisplayName("Test to Update First Name.")
    @Order(1)
    void testUpdateFirstName() {
        ContactService service = new ContactService();
        service.addContact("Darren", "Sheftic", "3153333333", "Auburn, NY");
        String contactID = service.contactList.get(0).getContactID(); // Get the ID of the first contact
        service.updateFirstName("Fox", contactID);
        assertEquals("Fox", service.getContact(contactID).getFirstName(), "First name was not updated.");
    }

    @Test
    @DisplayName("Test to Update Last Name.")
    @Order(2)
    void testUpdateLastName() {
        ContactService service = new ContactService();
        service.addContact("Darren", "Sheftic", "3153333333", "Auburn, NY");
        String contactID = service.contactList.get(0).getContactID(); // Get the ID of the first contact
        service.updateLastName("Jones", contactID);
        assertEquals("Jones", service.getContact(contactID).getLastName(), "Last name was not updated.");
    }

    @Test
    @DisplayName("Test to update phone number.")
    @Order(3)
    void testUpdatePhoneNumber() {
        ContactService service = new ContactService();
        service.addContact("Darren", "Sheftic", "3153333333", "Auburn, NY");
        String contactID = service.contactList.get(0).getContactID(); // Get the ID of the first contact
        service.updateNumber("1231231234", contactID);
        assertEquals("1231231234", service.getContact(contactID).getNumber(), "Phone number was not updated.");
    }

    @Test
    @DisplayName("Test to update address.")
    @Order(4)
    void testUpdateAddress() {
        ContactService service = new ContactService();
        service.addContact("Darren", "Sheftic", "3153333333", "Auburn, NY");
        String contactID = service.contactList.get(0).getContactID(); // Get the ID of the first contact
        service.updateAddress("Las Vegas, NV", contactID);
        assertEquals("Las Vegas, NV", service.getContact(contactID).getAddress(), "Address was not updated.");
    }

    @Test
    @DisplayName("Test to ensure that service correctly deletes contacts.")
    @Order(5)
    void testDeleteContact() {
        ContactService service = new ContactService();
        service.addContact("Darren", "Sheftic", "3153333333", "Auburn, NY");
        String contactID = service.contactList.get(0).getContactID(); // Get the ID of the first contact
        service.deleteContact(contactID);
        assertNull(service.getContact(contactID), "The contact was not deleted.");
    }

    @Test
    @DisplayName("Test to ensure that service can add a contact.")
    @Order(6)
    void testAddContact() {
        ContactService service = new ContactService();
        service.addContact("Darren", "Sheftic", "3153333333", "Auburn, NY");
        assertFalse(service.contactList.isEmpty(), "Contact was not added correctly.");
    }
}
