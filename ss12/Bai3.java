class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        System.out.print("Animal sound: ");
        myAnimal.makeSound();
        System.out.print("Dog sound: ");
        myDog.makeSound();
        System.out.print("Cat sound: ");
        myCat.makeSound();
    }
}
