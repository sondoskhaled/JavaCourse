package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter season of the year");
        String seasonOfYear = scanner.next();

        System.out.println("please enter an adjective");
        String adjective = scanner.next();

        System.out.println("please enter a number");
        int number = scanner.nextInt();

        scanner.close();
        System.out.println("On a "+adjective+" "+seasonOfYear+" day, I drink a minimum of "+number+" cups of coffee");

    }
}
