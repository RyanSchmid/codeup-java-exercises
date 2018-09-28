package ContactsProject;
import util.Input;


public class RunContacts {

    // NEED GET FROM TXT FILE AND LOAD INTO ARRAY LIST //
    Contact[] contactList;
    // define contactList;


//    private static void displayContacts(String search) {
//        Contact[] all;
//        if (search.equalsIgnoreCase("all")) {
//            for (Contact contact : allContacts) System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
//        } else {
//            for (Contact contact : allCOntacts) {
//                if (Contact.getLastName().equalsIgnoreCase())
//                    System.out.println(contact.getFirstName() + " " + contact.getLastName() + "  " + contact.getPhoneNumber());
//            }
//        }
//    }


    public static void main(String[] args) {

            System.out.println("Welcome to the contact management  application!");
            System.out.println("Please enter an option:");
            System.out.println("1 - VIEW contacts");
            System.out.println("2 - ADD a new contact");
            System.out.println("3 - SEARCH contacts by name");
            System.out.println("4 - SEARCH contacts by phone number");
            System.out.println("5 - DELETE a contact");
            System.out.println("0 - EXIT");

            while (true) {
                System.out.println("Enter your choice");
                Input input = new Input();
                int choice = input.getInt();
                switch (choice) {
                    case 0:
                        return;
                    case 1:
                        //displayContacts();
                        break;
                    case 2:
                        //addContact();
                        break;
                    case 3:
                        // searchContactsByName();
                        break;
                    case 4:
                        // searchContactsByNumber();
                        break;
                    case 5:
                        // deleteContact();
                        break;
                }
            }

    }
}
