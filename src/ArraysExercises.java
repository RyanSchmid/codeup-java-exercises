import java.util.Arrays;


public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person newPerson){
        Person[] newPeople = Arrays.copyOf(people, people.length +1);
        newPeople[newPeople.length-1] = newPerson;
        return newPeople;
    }

    public static void main(String[] args) {
//        int sizeOfFamily = 7;
//
//        Person person1 = new Person("Ryan");
//        Person person2 = new Person ("Sarah");
//        Person person3 = new Person ("LT");
//        Person person4 = new Person ("EJ");
//
//        Person[] family = new Person[sizeOfFamily];
//
//        family[0]= person1;
//        family[1]= person2;
//        family[2]= person3;
//        family[3]= person4;
//
//        for (Person familyMember: family) System.out.println(familyMember.name);

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        // FROM REVIEW //
        Person [] people = new Person[3];
        people[0]= new Person("Ryan");
        people[1]= new Person("Sarah");
        people[2]= new Person ("Pinot");
        for (Person person : people) System.out.println(person.name);

        System.out.println();
        // added person
        Person codeup = new Person("Codeup");
        Person[] morePeople = addPerson(people, codeup);
        for (Person person: morePeople) {
            System.out.println(person.getName());
        }
    }
}
