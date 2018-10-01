package ContactsProject;

public class ContactList {
    public static Contact[] findAll() {
        return new Contact[]{
                new Contact("Ryan", "Schmid", 1234567891),
                new Contact("Joe", "Coastie", 2101235555),
        };
    }
}