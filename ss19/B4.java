package ss19;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

class Person{
    private String name;
    private LocalDate bod;

    public Person(String name,LocalDate bod){
        this.name = name;
        this.bod = bod;

    }
    public Period getAge(){
        return Period.between(LocalDate.now(), bod);
    }
    public void printInfo(){
        System.out.println("Ten "+name+" bod "  +bod+ " tuoi "+getAge());
    }
}
public class B4 {
   public static void main(String[] args) {
    List<Person> people = List.of(

    new Person("Quý", LocalDate.of(2000, 3, 25)),

    new Person("Lan", LocalDate.of(1998, 7, 10)),

    new Person("Minh", LocalDate.of(2005, 12, 1))

);
    people.stream().forEach(e -> e.printInfo());
   }
}
