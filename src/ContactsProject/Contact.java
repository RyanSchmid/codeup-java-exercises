package ContactsProject;

import util.Input;

public class Contact {

    private String firstName;
    private String lastName;
    private String email;
    private long phoneNumber;

    // CONSTRUCTORS

    public Contact() {
    }

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Contact(String firstName, String lastName, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Contact(String firstName, String lastName, String email, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // GETTERS AND SETTERS
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public static void displayContacts(String filter) {
        Contact[] all = ContactList.findAll();
        if (filter.equalsIgnoreCase("all")) {
            for (Contact contact : all)
                System.out.println(contact.getFirstName() + " " + contact.getLastName() + " -- " + contact.getPhoneNumber());
        } else {
            for (Contact contact : all) {
                if (contact.getLastName().equalsIgnoreCase(filter))
                    System.out.println(contact.getFirstName() + " " + contact.getLastName() + " -- " + contact.getPhoneNumber());
            }
        }
    }


    public static void addContact(){
        System.out.println("Please add a contact");
        Contact addedContact = new Contact();
        Input addInput1 = new Input();
        addedContact.setFirstName(addInput1.getString("please enter a firstname"));
        System.out.println(addInput1.toString());
        Input addInput2 = new Input();
        addedContact.setFirstName(addInput2.getString("please enter a lastname"));
        System.out.println(addInput2.toString());
        Input addInput3 = new Input();
        addedContact.setFirstName(addInput3.getString("please enter a phone number"));
        System.out.println(addInput3.toString());


    }

    public static void searchContactsByName(String name) {
        Contact[] all = ContactList.findAll();
        for (Contact contact : all) {
            if (contact.getLastName().contains(name) || contact.getFirstName().contains(name))
                System.out.println(contact.getFirstName() + " " + contact.getLastName() + " -- " + contact.getPhoneNumber());
        }
    }



}
