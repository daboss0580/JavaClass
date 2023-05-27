package ReplitAssignment;

public class A166Animal {
    String name;
    String color;
    String breed;
    double price;
    public A166Animal(String name, String color, String breed, double price){
        this.name=name;
        this.color=color;
        this.breed=breed;
        this.price=price;
    }
    void eat(){
        System.out.println("Animal eats animal foods");
    }
    void sleep(){
        System.out.println("Animals sleeps ZZZZZZZZZZZzzzzzzzzzzzzzZZZZZZZZ");
    }
}
class A166Cat extends A166Animal{
    A166Cat(String name, String color, String breed, double price){
        super(name, color, breed, price);
    }
    void eat(){
        System.out.println("Cat eats");
    }
    void sleep(){
        System.out.println("Cat sleeps a lot");
    }
}
class Kitten1 extends A166Cat{
    Kitten1(String name, String color, String breed, double price){
        super(name, color, breed, price);
    }
    void eat(){
        System.out.println("kitten1 eats milk");
    }
    void sleep(){
        System.out.println("kitten1 sleeps a lot");
    }
}
class Kitten2 extends A166Cat{
    Kitten2(String name, String color, String breed, double price){
        super(name, color, breed, price);
    }
    void eat(){
        System.out.println("kitten2 eats snacks");
    }
    void sleep(){
        System.out.println("kitten2 sleeps a lot");
    }
}
class Kitten3 extends A166Cat{
    Kitten3(String name, String color, String breed, double price){
        super(name, color, breed, price);
    }
    void eat(){
        System.out.println("kitten3 eats everything");
    }
    void sleep(){
        System.out.println("kitten3 sleeps a lot");
    }
}
class A166Tester{
    public static void main(String[] args) {
        A166Animal[] animal={new A166Cat("Pablo", "Black", "Li Hua", 492.99),
        new Kitten1("Kitty", "White", "Li Hua", 120.22),
        new Kitten2("Billy", "Grey", "Li Hua", 129.22),
        new Kitten3("Kelly", "Black", "Li Hua", 139.22)
        };
        for (A166Animal animals:animal){
            animals.eat();
            animals.sleep();
        }
    }
}