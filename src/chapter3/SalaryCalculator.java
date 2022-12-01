package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main (String args[]){
        /**
         * fixed salary = 1000
         * ask user to enter sales number
         * if condition to ask if sales > 10 or not
         * if yes this person receive bonus = 250
         * */

        int  salary = 1000 ;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales did the employee make this week?");

        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales > quota){
            salary = salary + bonus;
        }

        System.out.println("the employee's pay is $ = " +salary);
    }
}
