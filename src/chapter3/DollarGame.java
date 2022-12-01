package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main (String args[]){
        int penniesValue = 1;
        int nickelsValue = 5;
        int dimesValue = 10;
        int quartersValue = 25;

        Scanner scanner = new Scanner(System.in);

        System.out.println("how many pennies you have ?");
        int pennies = scanner.nextInt();

        System.out.println("how many nickels you have ?");
        int nickels = scanner.nextInt();

        System.out.println("how many dimes you have ?");
        int dimes = scanner.nextInt();

        System.out.println("how many quarters you have ?");
        int quarters = scanner.nextInt();

        int penniesResult = pennies * penniesValue;
        int nickelsResult = nickels * nickelsValue;
        int dimesResult = dimes * dimesValue;
        int quartersResult = quarters * quartersValue;

        int total = penniesResult + nickelsResult + dimesResult + quartersResult;

        if(total == 100){
            System.out.println("Yoy win the game");
        } else if (total < 100) {
            int result = 100 - total;
            System.out.println("your money is under 1$ by "+result+" .");
        } else if (total > 100) {
            int result = total - 100;
            System.out.println("your money is more than 1$ by "+result+" .");
        }


    }
}
