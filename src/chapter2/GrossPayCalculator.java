package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main (String arg[]){
        /**
         * 1- get the number of hours worked
         * 2- get the hourly pay rate
         * 3- multiply hours and pay rate
         * 4- display result
         */
        // 1
        System.out.println("enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // 2
        System.out.println("enter the employee's pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();

        // 3
        double grossPay = hours * rate;

        // 4
        System.out.println("gross pay is:"+grossPay);
    }
}
