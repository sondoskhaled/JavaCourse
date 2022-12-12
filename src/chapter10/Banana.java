package chapter10;

public class Banana extends Fruit{

    public Banana(){
        setCalories(55);
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made!");
    }

    public void peel (){
        System.out.println("Peeling is done");
    }
}
