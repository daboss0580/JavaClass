package Class21;


class Animal1{
    String name;
    String color;

    String breed;

    public Animal1(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }

    void speak(){
        System.out.println("Animals speak");
    }
    void sleep(){
        System.out.println("Animals sleep from 1 to 20 hours a day");
    }
    void eat(){
        System.out.println("Animals eat many different things ");
    }
}
class Cat1 extends Animal1{

    public Cat1(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("Meow meow.....");
    }
    @Override
    void eat(){
        System.out.println("Cats like to eat Fish");
    }

    @Override
    void sleep() {
        System.out.println("Cats like to sleep 15 hours on Average");
    }
}
public class Dog1 extends Animal1{


    public Dog1(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak(){
        System.out.println("woof woof");
    }

    @Override
    void sleep() {
        System.out.println("Dogs sleep 8 hours");
    }

    @Override
    void eat() {
        System.out.println("Dogs like to chew the bones");
    }
}

class Horse1 extends Animal1{

    public Horse1(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("neigh neigh");
    }

    @Override
    void eat() {
        System.out.println("Horses like Carrots+ Grass");
    }

    @Override
    void sleep() {
        System.out.println("Horses sleep 2-3 hours");
    }
}

class AnimalTester1 {
    public static void main(String[] args) {
        Dog1 dog=new Dog1("shaggy","black","German");
        dog.printInfo();
        //Parent class variables can store the objects of the child classes
        Animal1 dog1=new Dog1("shaggy","black","German");
        dog1.printInfo();

        Animal1 [] animals={new Dog1("shaggy","black","German"),new Cat1("Tom","Blue","persian")};

        for(Animal1 animal:animals){
            animal.printInfo();
        }



    }
}
