package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]){
         double plan = getPlan();
         double minutes = getMinutes();
         double overage = calculateOverageFees(minutes);
        double tax = calculateTax(plan , overage);
         calculateTotal(plan , tax , overage);
    }

    static public double getPlan (){
        System.out.println("Enter base cost of the plan:");

        double plan = scanner.nextDouble();

        return plan;
    }

    static public double getMinutes(){
        System.out.println("Enter overage minutes:");

        double minutes = scanner.nextDouble();

        return minutes;
    }

    static public double calculateTax(double plan , double overage){
        // tax = plan * 15%
        double tax = (plan + overage) * 0.15;
        return tax;
    }

    static public double calculateOverageFees(double minutes){
        // overage = minutes * 0.25
        double overage = minutes * 0.25;
        return overage;
    }

    static public void calculateTotal(double plan , double tax , double overage){
        //total = plan + tax + overage
        double total = plan + tax + overage;

        // print
        System.out.println("Phone Bill Statement \nPlan:  $"+plan+"\nOverage:  $"+
                overage+"\nTax:  $"+tax+"\n" +
                "Total:  $"+total);

    }

}
