package ex6;
public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println("Roar!");
    }

    @Override
    void move() {
        System.out.println("The lion is running.");
    }
}