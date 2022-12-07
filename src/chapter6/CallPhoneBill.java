package chapter6;

import java.util.Scanner;

public class CallPhoneBill {
    public static void main (String args[]){
        PhoneBillCalculatorRedo bill = new PhoneBillCalculatorRedo(123456);
        bill.setUsedMinutes(1000);
        bill.printBill();

    }
}
