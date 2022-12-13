package chapter11;

public class Farm {
    public static void main(String[] args) {
        Animal pig = new Pig();
        pig.makeSound();
        pig.eat();

        Pig pig2 = new Pig();
        pig2.makeSound();
        pig2.eat();

        Animal duck = new Duck();
        duck.makeSound();
        duck.eat();

        Duck duck2 = new Duck();
        duck2.makeSound();
        duck2.eat();
    }
}
