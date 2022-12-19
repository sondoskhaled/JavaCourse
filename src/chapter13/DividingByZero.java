package chapter13;

public class DividingByZero {
    public static void main(String[] args) {
        try {
            int c = 30 / 0;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("you can't divide by zero");
            //e.printStackTrace();
        }finally {
            System.out.println("Division is fun");
        }
    }
}
