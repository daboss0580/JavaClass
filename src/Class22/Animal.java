package Class22;
/*
create 3 animals like Dog Cat and Horse
    define 3 common methods in each class like speak eat and sleep.
    create the object of all the classes and call the methods.
 */



public abstract class Animal {
   abstract void speak();
    abstract void eat();
    abstract void sleep();

    String name;
    String color;
    String breed;
    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
    void run(){
        System.out.println("All animals run");
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
}
class Dog extends Animal{
    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    void speak(){
        System.out.println("Woof woof");
    }
    void eat(){
        System.out.println("Dog eats bones");
    }
    void sleep(){
        System.out.println("Dog sleeps 12 – 14 hours daily");
    }
}
class Cat extends Animal{
    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    void speak(){
        System.out.println("Meow Meow");
    }
    void eat(){
        System.out.println("Cats eats fishes");
    }
    void sleep(){
        System.out.println("Cats sleeps 12 – 16 hours daily");
    }
}
class Horse extends Animal{
    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    void speak(){
        System.out.println("Neigh neigh");
    }
    void eat(){
        System.out.println("Animal eats hays");
    }
    void sleep(){
        System.out.println("Animal sleeps 2.9 hours daily");
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Animal [] animal={new Dog("Jack","Black","German Shepherd"), new Cat("Kitty","White","Cobby"),new Horse("Josh","Brown","Abtenauer")};
        for (Animal animals:animal){
            animals.eat();
            animals.sleep();
            animals.speak();
            animals.printInfo();
            animals.run();
        }
    }
}