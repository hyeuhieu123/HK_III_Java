package B6;


public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion lion = new Lion("lion1", 1);
        Elephant elephant = new Elephant("elephant1", 2);

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);

        zoo.showAllAnimals();
    }
}