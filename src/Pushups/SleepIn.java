package Pushups;

public class SleepIn {


    public static boolean sleepIn(boolean isWeekday, boolean onVacation) {
        return (!isWeekday || onVacation);
    }

//          Long form
//        if (!isWeekday || onVacation)
//            return true;
//
//        else
//            return false;


    public static void main(String[] args) {
        boolean isWeekday = false;
        boolean onVacation = false;
        System.out.println(sleepIn(isWeekday, onVacation));


    }
}
