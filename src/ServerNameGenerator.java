import java.util.Random;

public class ServerNameGenerator {


    public static String[] adjectives = {"snowy", "rainy", "stormy", "windy", "cold", "freezing",
            "sunny", "thundering", "flooding", "blustery"};

    public static String[] nouns = {"winter", "mountain", "lake", "river", "forest", "jungle",
            "fjord", "glacier", "summit", "valley"};

    // build the generator

    public static String pickRandomWord(String[] words){
        Random rand = new Random();
        int i = rand.nextInt(words.length);
        return words[i];
    }

    public static void main(String[] args){
    String word1 = pickRandomWord(adjectives);
    String word2 = pickRandomWord(nouns);
        System.out.println("Here is your server name:");
        System.out.println(word1 + "-" + word2);
    }
}



//    public static void generateName(String[] array1, String[] array2) {
//        int designator = (int) Math.floor((Math.random() * array1.length) - 1);
//        int designator2 = (int) Math.floor((Math.random() * array2.length) - 1);
//        System.out.println("Here is your server name:");
//        System.out.println(array1[designator] + "-" + array2[designator2]);
//    };
//
//    // cal the generator
//    public static void main(String[] args) {
//        generateName(adjectives, nouns);
//    }
//
//}