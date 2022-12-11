package chapter9;

public class TasteTester {

    public static void main(String args[]){
        Cake cake = new Cake("lutes");
        cake.print();

        BirthdayCake birthdayCake = new BirthdayCake("chocolate ");
        birthdayCake.setCandles(8);
        birthdayCake.print();

        WeddingCake weddingCake = new WeddingCake("vanilla");
        weddingCake.setTiers(3);
        weddingCake.print();
    }
}
