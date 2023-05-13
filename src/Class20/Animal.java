package Class20;

public class Animal {
    /*
    Create 3 animal classes, create 3 methods in each class. Create 4 fields and constructors
    as well in each class. Create the object of all 3 classes and call 2 methods from each class.
    you must use inheritance to avoid code duplication.
     */
    private String name;
    private String breed;
    private String color;
    double weight;
    void sleep()
    {
        System.out.println("ZZZZZZZZZZZzzzzzzzzzzzzzzZZZZZZZZZZZ");
    }
    void eat()
    {
        System.out.println("YumyumyumyumyuM");
    }
    void fight()
    {
        System.out.println("FighT");
    }
    public Animal(String name, String breed, String color, double weight){
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.weight=weight;
    }
    void printInfo()
    {
        System.out.println(name+" "+breed+" "+color+" "+weight);
    }
    static class Dog extends Animal

    {
        String bark;
        public Dog(String name, String breed, String color, String bark, double weight)
        {
            super(name, breed, color, weight);
            this.bark=bark;
        }
        void sleep()
        {
            System.out.println("I like to sleep for 10.6hrs a day");
        }

        void printInfo() {
            super.printInfo();
            System.out.println(bark);
        }
    }
    static class Cat extends Animal

    {
        double price;
        public Cat(String name, String breed, String color, double weight, double price)
        {
            super(name, breed, color, weight);
            this.price=price;
        }
        void printInfo()
        {
            super.printInfo();
            System.out.println(price);
        }
    }
    static class Horse extends Animal

    {
        int speed;
        public Horse(String name, String breed, String color, double weight, int speed)
        {
            super(name, breed, color, weight);
            this.speed=speed;
        }

@Override
        void sleep()

        {
            super.sleep();
            System.out.println("Sleeps a few hours");
        }
        void printInfo()
        {
            super.printInfo();
            System.out.println(speed);
        }

    }
    static class SmallDog extends Dog{
        String play;
        public SmallDog(String name, String breed, String color, String bark, double weight, String play){
            super(name, breed, color, bark, weight);
            this.play=play;
        }
        void printInfo()
        {
            super.printInfo();
            System.out.println(play);
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Koko","Caucasian","Gold","WoofwooF",46.3);
        Cat cat = new Cat("Pop","Dunno", "White", 21.4,300);
        Horse horse = new Horse("Gavin", "Dunno","Black", 158.58,102);
        SmallDog smallDog = new SmallDog("Kiki","Buabel","Black","WoofwooF",19.4,"Play");
        dog.sleep();
        /*
        dog.eat();
        dog.fight();
        dog.sleep();
        dog.printInfo();

        cat.eat();
        cat.fight();
        cat.sleep();
        cat.printInfo();

        horse.eat();
        horse.fight();
        horse.sleep();
        horse.printInfo();

        smallDog.eat();
        smallDog.fight();
        smallDog.sleep();
        smallDog.printInfo();
         */

    }
}
