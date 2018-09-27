package Pushups;
import java.util.ArrayList;
import java.util.HashMap;

public class Pets {

    public static void main(String[] args) {

        ArrayList<HashMap> petList = new ArrayList<>();


        HashMap<String, String> pet1 = new HashMap<>();
        pet1.put("name", "Daisy");
        pet1.put("age", "4");
        pet1.put("breed", "labrador");

        HashMap<String, String> pet2 = new HashMap<>();
        pet2.put("name", "Daisy");
        pet2.put("age", "4");
        pet2.put("breed", "labrador");

        HashMap<String, String> pet3 = new HashMap<>();
        pet3.put("name", "Cooper");
        pet3.put("age", "1");
        pet3.put("breed", "retreiver");

        HashMap<String, String> pet4 = new HashMap<>();
        pet4.put("name", "Potato");
        pet4.put("age", "10");
        pet4.put("breed", "bulldog");


        petList.add(pet1);
        petList.add(pet2);
        petList.add(pet3);
        petList.add(pet4);

        System.out.println(petList);


    }















//    String name;
//    String typeOfPet;
//    int age;
//    int weight;
//
//    public Pets(String name) {
//        this.name = name;
//    }
//
//    public Pets(String name, String typeOfPet) {
//        this.name = name;
//        this.typeOfPet = typeOfPet;
//    }
//
//    public Pets(String name, String typeOfPet, int age) {
//        this.name = name;
//        this.typeOfPet = typeOfPet;
//        this.age = age;
//    }
//
//
//    //GETTERS
//
//    public String getName() {
//        return this.name;
//    }
//
//    public String getTypeOfPet() {
//        return this.typeOfPet;
//    }
//
//    public int getAge() {
//        return this.age;
//    }
//
//    public int getWeight() {
//        return this.weight;
//    }
//
//
//    //SETTERS
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setTypeOfPet(String typeOfPet) {
//        this.typeOfPet = typeOfPet;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setWeight(int age) {
//        this.weight = weight;
//    }
//
//
//    public static void main(String[] args) {
//        Pets daisy = new Pets("Daisy", "dog", 4);
//        Pets lucy = new Pets("Lucy", "dog", 4);
//        Pets rocco = new Pets("Rocco", "parrot", 15);
//        Pets aqua = new Pets("Aqua", "fish", 1);
//
//
//    }





}
