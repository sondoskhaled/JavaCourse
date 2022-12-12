package chapter10;

public class Fruit {
    public double calories = 5;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void makeJuice(){
        System.out.println("Juice is made!");
    }
}
