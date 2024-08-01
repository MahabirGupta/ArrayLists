package MobilePhoneChallenge;


public class Contact  {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber ) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public String getNumber() {
        return phoneNumber;
    }

    public void setNumber(String number) {
        this.phoneNumber = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Static method to create a new Contact object
    public static Contact createContact(String name, String number) {
        return new Contact(name, number);
    }

    // Override toString method
    @Override
    public String toString() {
        return name + " -> " + phoneNumber;
    }


    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Contact contact = (Contact) obj;
        return name.equals(contact.name) && phoneNumber.equals(contact.phoneNumber);
    }
}
