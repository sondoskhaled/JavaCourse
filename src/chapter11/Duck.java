package chapter11;

public class Duck extends Animal{
    @Override
    void makeSound() {
        System.out.println("Duck sound");
    }

    @Override
    void eat(){
        System.out.println("Duck food");
    }
}
