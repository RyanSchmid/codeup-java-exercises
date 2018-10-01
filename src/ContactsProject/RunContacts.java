package ContactsProject;
import util.Input;


public class RunContacts {

    // NEED GET FROM TXT FILE AND LOAD INTO ARRAY LIST //
    //Contact[] contactList;
    // define contactList;


    public static void displayMenu() {
        System.out.println("Please enter an option:");
        System.out.println("1 - VIEW contacts");
        System.out.println("2 - ADD a new contact");
        System.out.println("3 - SEARCH contacts by name");
        System.out.println("4 - SEARCH contacts by phone number");
        System.out.println("5 - DELETE a contact");
        System.out.println("0 - EXIT");
    }


    public static void main(String[] args) {

            System.out.println("Welcome to the contact management  application!");

            displayMenu();

            while (true) {
                System.out.println("Enter your choice");
                Input input = new Input();
                int choice = input.getInt();
                switch (choice) {
                    case 0:
                        return;
                    case 1:
                        Input userInput = new Input();
                        Contact.displayContacts("all");
                        //displayMenu();
                        break;
                    case 2:
                        Contact.addContact();
                        //displayMenu();
                        break;
                    case 3:
                        Input userInput3 = new Input();
                        String nametoSearch = userInput3.getString("Please enter a name to search for:");
                        Contact.searchContactsByName(nametoSearch);
                        //displayMenu();
                        break;
                    case 4:
                        // searchContactsByNumber();
                        //displayMenu();
                        break;
                    case 5:
                        // deleteContact();
                        //displayMenu();
                        break;
                }
            }

    }
}
