import java.util.Arrays;


public class ArraysExercises {

//    Person person1 = new Person("Ryan");
//    Person person2 = new Person ("Sarah");
//    Person person3 = new Person ("LT");
//    Person person4 = new Person ("EJ");
//
//    Person[] family = [person1, person2, person3, person4];



//    family[0] = me;
//    family[1] = wife;
//    family[2] = sister;
//
    public static void main(String[] args) {
        int sizeOfFamily = 7;

        Person person1 = new Person("Ryan");
        Person person2 = new Person ("Sarah");
        Person person3 = new Person ("LT");
        Person person4 = new Person ("EJ");

        Person[] family = new Person[sizeOfFamily];

        family[0]= person1;
        family[1]= person2;
        family[2]= person3;
        family[3]= person4;

        for (Person familyMember: family) System.out.println(familyMember.name);



//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

    }

//    public static Person[] addPerson (String[] peopleArray, String newPerson){
//        Person newPerson = new Person(newPerson);
//        int arrayLength = peopleArray.length;
//        peopleArray[arrayLength] = newPerson;
//    }

}
