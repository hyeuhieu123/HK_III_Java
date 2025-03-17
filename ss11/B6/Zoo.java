package B6;


public class Zoo {
    private Animal[] animals = new Animal[2];
    private int size;

    public Zoo() {
        animals = new Animal[2];
        size = 0;
    }

    public void addAnimal(Animal animal) {
        if (size < 2) {
            animals[size] = animal;
            size++;
        } else {
            System.out.println("Zoo is full! Cannot add more animals.");
        }
    }

    public void showAllAnimals() {
        for (int i = 0; i < size; i++) {
            System.out.println("Animal: " + animals[i].name + " Age: " + animals[i].age + "");
            animals[i].sound();
            animals[i].move();
        }
    }
}