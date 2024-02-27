/*
 * Name: 	Darren Sheftic 
 * Course: 	CS320 
 * Date: 	January 28, 2024
 * Description: This is the contact class.
*/

package Contact;

import java.util.UUID;



public class Contact {
	private final String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;

	/*
	 * The constructor takes first name, last name, phone number, and address as
	 * parameters. Generates a new ID for the contactID
	 * field.
	 */
	public Contact(String firstName, String lastName, String number, String address) {

		// Contact ID is generated when the constructor is called using a "Universally Unique Identifier". 
		// It is set as a final variable and has no other getter or setter so there is no way to change it.
		this.contactID = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8);

		// First Name
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "NULL";
		// If first name is longer than 10 characters only use the first 10 characters
		} else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		} else {
			this.firstName = firstName;
		}

		// Last Name
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "NULL";
		} else if (lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
		} else {
			this.lastName = lastName;
		}
		
		// Phone #
		if (number == null || number.isEmpty() || number.length() != 10) {
			this.number = "5555555555";
		} else {
			this.number = number;
		}
		
		// Address
		if (address == null || address.isEmpty()) {
			this.address = "NULL";
		} else if (address.length() > 30) {
			this.address = address.substring(0, 30);
		} else {
			this.address = address;
		}
	}

	// Getters
    public String getContactID() {
        return contactID;
    }

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNumber() {
		return number;
	}

	public String getAddress() {
		return address;
	}

	// Setters
	
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "NULL";
		} else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		} else {
			this.firstName = firstName;
		}
	}

	public void setLastName(String lastName) {
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "NULL";
		} else if (lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
		} else {
			this.lastName = lastName;
		}
	}

	public void setNumber(String number) {
		if (number == null || number.isEmpty() || number.length() != 10) {
			this.number = "5555555555";
		} else {
			this.number = number;
		}
	}

	public void setAddress(String address) {
		if (address == null || address.isEmpty()) {
			this.address = "NULL";
		} else if (address.length() > 30) {
			this.address = address.substring(0, 30);
		} else {
			this.address = address;
		}
	}
}