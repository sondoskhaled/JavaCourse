package chapter3;

import java.util.Scanner;

public class LogicalOperatorLongQualifier {
    public static void main (String args []){
        int requiredSalary = 30000;
        int requiredYearsEmployed =2;

        System.out.println("Enter your salary:");

        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        if(salary >= requiredSalary && years >= requiredYearsEmployed ){
                System.out.println("Congrats! you Qualify for the loan");

        }
        else {
            System.out.println("Sorry, you must earned at least $"
                    +requiredSalary+ "you must have worked at your current job "
                    +requiredYearsEmployed+ "years to qualify for the loan");
        }




    }
}