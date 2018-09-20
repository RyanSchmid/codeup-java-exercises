public class Sandbox {

    public static int recurse(int num) {
        if (num < 1) return 1;
        System.out.println(num);
        return recurse(num -1);
    };


    public static void main(String[] args){

        recurse(4);
//        byte tiny = 100;
//        short small = 32000;
//        int justRight = 60000000;
//        long longerrr = 1000000000L;
//        float specific = 5.67f;
//        double moreSpecific = 8.7890832953274039;
//        char zed = 'z';
//        String stringTheory = "so much math";
//        boolean amIright = true;
//
//        System.out.println(tiny);
//        System.out.println(small);
//        System.out.println(justRight);
//        System.out.println(longerrr);
//        System.out.println(specific);
//        System.out.println(moreSpecific);
//        System.out.println(zed);
//        System.out.println(stringTheory);
//        System.out.println(amIright);

    }
}
