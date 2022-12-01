package chapter3;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main (String args[]){
        int rate =15;
        int maxHours =40;

        System.out.println("How many hours did you work this week?");

        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //validate input
        while (hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. yours hours must be between 1 and 40." +
                    "try again.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //calculate the gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);

    }
}
