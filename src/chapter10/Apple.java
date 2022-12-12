package chapter10;

public class Apple extends Fruit {

    public Apple(){
        setCalories(35);
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made!");
    }

    public void removeSeeds(){
        System.out.println("remove seeds is done");
    }
}
