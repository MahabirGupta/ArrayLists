package MobilePhoneChallenge;

import java.util.ArrayList;

public class MobilePhone {

    private static ArrayList<Contact> myContacts = new ArrayList<>();


    public MobilePhone(String myNumber) {
        this.myContacts = new ArrayList<>();
    }

    public static void main(String[] args) {
//      Contact  contact1 = new Contact("Bob","31415926");
      Contact  contact1 = Contact.createContact("Bob","31415926");
      Contact contact2 = Contact.createContact("Alice","16180339");
        Contact contact3 = Contact.createContact("Tom","11235813");
        Contact contact4 = Contact.createContact("Jane","23571113");
        Contact  newContact = Contact.createContact("Bob","96492491");
        Contact newContact2 = Contact.createContact("Alice","16180339");
        Contact contact5 = Contact.createContact("Babita","23571113");
        Contact contact6 = Contact.createContact("Alice","16180339");


        addNewContact(contact1);
        addNewContact(contact1);
        addNewContact(contact3);
        addNewContact(contact4);
        addNewContact(contact6);

        printContacts();
        System.out.println();


        updateContact(contact1,newContact);
        updateContact(contact2,newContact2);
        System.out.println();

        removeContact(contact3);
        removeContact(contact5);

        System.out.println();
        findContact(contact4);
        findContact(contact3);
        System.out.println();

        findContact("96492491");
        System.out.println();

//        queryContact("Bob");
        Contact queriedContact = queryContact("Alice");
        if (queriedContact != null) {
            System.out.println("Queried Contact: " + queriedContact);
        } else {
            System.out.println("Contact not found.");
        }
//        contact1.createContact(contact1.getName(),contact1.getNumber());
        System.out.println();
        printContacts();

    }

    private static int findContact(Contact contact4) {
        int findPosition = myContacts.indexOf(contact4);
        if (findPosition>=0){
            System.out.println("Contact exits " + contact4.getName() + " " + contact4.getNumber());
            return findPosition;
        }else {
            System.out.println("Contact does not exits " + contact4.getName() + " " + contact4.getNumber());
            return -1;
        }
    }

    public static void printContacts() {
        System.out.println("Contact List:");
        for (Contact contact : myContacts) {
            System.out.println(contact); // This will call the overridden toString method
        }
    }



    public static Contact queryContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact exists");
                return contact;
            }
        }
        System.out.println("Contact does not exist");
        return null;
    }

//    private static Contact findContact(String myNumber) {
//
//        for (Contact contact : myContacts) {
//            if (contact.getNumber().equalsIgnoreCase(myNumber)) {
//                System.out.println("Contact exists " + contact.getName() + " " + contact.getNumber());
//                return contact;
//            }
//        }
//        System.out.println("Contact does not exist " );
//        return null;
//
//    }

    private static int findContact(String myNumber) {

        for (Contact contact : myContacts) {
            if (contact.getNumber().equalsIgnoreCase(myNumber)) {
                System.out.println("Contact exists " + contact.getName() + " " + contact.getNumber());
                return myContacts.indexOf(myNumber);
            }
        }
        System.out.println("Contact does not exist " );
        return -1;

    }

    public static boolean removeContact(Contact contactToDelete) {
        if (myContacts.contains(contactToDelete)){
            System.out.println("Contact already exist " + contactToDelete.getName() + " " + contactToDelete.getNumber());
            int foundPosition = myContacts.indexOf(contactToDelete);
            myContacts.remove(foundPosition);
            System.out.println("Contact has been deleted");
            return true;
        }else{
            System.out.println("Contact does not exist " + contactToDelete.getName() + " " + contactToDelete.getNumber());
            return false;
        }
    }

    public static boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = myContacts.indexOf(oldContact);
        if (foundPosition < 0) {
            System.out.println("Contact does not exist: " + oldContact.getName() + " " + oldContact.getNumber());
            return false;
        } else if (myContacts.contains(newContact)) {
            System.out.println("Contact already exists: " + newContact.getName() + " " + newContact.getNumber());
            return false;
        } else {
            myContacts.set(foundPosition, newContact);
            System.out.println("Contact updated successfully: " + newContact.getName() + " " + newContact.getNumber());
            return true;
        }
    }

    public static boolean addNewContact(Contact contact) {
        if (myContacts.contains(contact)){
            System.out.println("Contact already exist");
            return false;
        }else{
            myContacts.add(contact);
            System.out.println("Contact added: " + contact);
            return true;
        }
    }
}
