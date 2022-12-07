package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    public static final String[] weekDays = {"monday" , "tuesday" , "wednesday" ,
    "thursday" , "friday" , "saturday" , "sunday"};
    public static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]){
        System.out.println("Enter number of day from 1 to 7");
        String day = checkDay(scanner.nextInt());
        System.out.println(day);
    }

    public static String checkDay(int day){
        return weekDays[day-1] ;
    }



}
