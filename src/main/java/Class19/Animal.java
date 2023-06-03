package Class19;

public class Animal {
    // create 3 classes like Dog Cat Horse define 5 properties (use default access level)
    // you can use inheritance to avoid code duplication
    // and one printInfo method that will print the values of these variables.
    // create constructors as well in each child class to initialize those
    // properties create one object of each class and call the printInfo method
    private String name;
    private String color;
    private String breed;
    int age;
    double weight;

    public Animal(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed + " " + weight + " " + age);
    }
}

class Dog extends Animal {
    double price;

    public Dog(String name, String color, String breed, int age, double weight, double price) {
        super(name, color, breed, age, weight);
        this.price = price;
    }

    void printInfo() {
        super.printInfo();
        System.out.println(price);
    }
}

class Cat extends Animal {

    public Cat(String name, String color, String breed, int age, double weight) {
        super(name, color, breed, age, weight);
    }
}

class Horse extends Animal {

    public Horse(String name, String color, String breed, int age, double weight) {
        super(name, color, breed, age, weight);
    }
}

class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Tom", "Black", "Pittbull", 12, 50.2, 1500);
        dog.printInfo();
        Cat cat = new Cat("Manny", "Black", "Witch", 5, 21.6);
        cat.printInfo();
        Horse horse = new Horse("Kelly", "White", "Fine", 18, 130.7);
        horse.printInfo();
    }
}

