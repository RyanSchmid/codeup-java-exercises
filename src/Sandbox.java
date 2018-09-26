public class Sandbox {

    public static int recurse(int num) {
        if (num < 1) return 1;
        System.out.println(num);
        return recurse(num - 1);
    }

    ;


    public static void main(String[] args) {

//        recurse(4);
//        countdown(5);
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int num : numbers) System.out.print(num + " ");
//        System.out.println();
//        for (int num : reverse(numbers)) System.out.print(num + " ");

        System.out.println(countUp(7));
    }

    public static int countdown(int x) {
        if (x > 0) {
            System.out.println(x);
            return countdown(x - 1);
        } else {
            System.out.println("Blastoff");
            return 0;
        }
    }


    public static int[] reverse(int[] nums) {
        int[] backwards = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            //backwards.unshift(nums[i])
            for (int num : backwards)
                System.out.print(num + " ");
            System.out.println();
            backwards[backwards.length - i - 1] = nums[i];
        }
        return backwards;
    }




    public static int countUp(int counter){
        if (counter == 1) {
            System.out.println(counter);
            return counter;
        }
        else {
            countUp(counter-1);
            System.out.println(counter);
        };
        return counter;
    }


}

