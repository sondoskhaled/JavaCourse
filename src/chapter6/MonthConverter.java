package chapter6;

public class MonthConverter {
    public static void main (String args[]){
        // call static methods without make instance from class
        System.out.println(Month.getMonth(2));

        System.out.println(Month.getMonth("May"));
    }
}
