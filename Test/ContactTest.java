package Test;

import org.junit.jupiter.api.Test;
import Contact.Contact;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class ContactTest {

    @BeforeEach
    void testValidContactCreation() {
        // Happy path: Creating a valid contact
        Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
        assertNotNull(contact, "Contact should be created successfully.");
    }

    @Test
    void testContactIDLength() {
        // Failing path: Contact ID cannot have more than 10 characters
        Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
        assertTrue(contact.getContactID().toString().length() <= 10, "Contact ID should have 10 characters or less.");
    }

    @Test
    void testFirstNameLength() {
        // Failing path: First Name cannot have more than 10 characters
        Contact contact = new Contact("VeryLongFirstName", "Doe", "1234567890", "123 Main St");
        assertTrue(contact.getFirstName().length() <= 10, "First Name should have 10 characters or less.");
    }

    @Test
    void testLastNameLength() {
        // Failing path: Last Name cannot have more than 10 characters
        Contact contact = new Contact("John", "VeryLongLastName", "1234567890", "123 Main St");
        assertTrue(contact.getLastName().length() <= 10, "Last Name should have 10 characters or less.");
    }

    @Test
    void testPhoneNumberLength() {
        // Failing path: Phone number must be exactly 10 characters
        Contact contact = new Contact("John", "Doe", "12345", "123 Main St");
        assertEquals("5555555555", contact.getNumber(), "Phone number should default to '5555555555' if not exactly 10 characters.");
    }

    @Test
    void testAddressLength() {
        // Failing path: Address cannot have more than 30 characters
        Contact contact = new Contact("John", "Doe", "1234567890", "Very Long Address That Exceeds 30 Characters");
        assertTrue(contact.getAddress().length() <= 30, "Address should have 30 characters or less.");
    }

    @Test
    void testFirstNameNotNull() {
        // Failing path: First Name cannot be null
        Contact contact = new Contact(null, "Doe", "1234567890", "123 Main St");
        assertNotNull(contact.getFirstName(), "First Name should not be null.");
    }

    @Test
    void testLastNameNotNull() {
        // Failing path: Last Name cannot be null
        Contact contact = new Contact("John", null, "1234567890", "123 Main St");
        assertNotNull(contact.getLastName(), "Last Name should not be null.");
    }

    @Test
    void testPhoneNumberNotNull() {
        // Failing path: Phone Number cannot be null
        Contact contact = new Contact("John", "Doe", null, "123 Main St");
        assertNotNull(contact.getNumber(), "Phone Number should not be null.");
    }

    @Test
    void testAddressNotNull() {
        // Failing path: Address cannot be null
        Contact contact = new Contact("John", "Doe", "1234567890", null);
        assertNotNull(contact.getAddress(), "Address should not be null.");
    }
}
