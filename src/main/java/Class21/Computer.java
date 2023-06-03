package Class21;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */
    String operatingSystem;
    String processor;
    String color;

    public Computer(String operatingSystem, String processor, String color) {
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.color = color;
    }

    void storage()
    {
        System.out.println("Computer stores data");
    }
    void audio()
    {
        System.out.println("Computer has speaker for audio output");
    }
    void keyboard()
    {
        System.out.println("Computer has keyboard for inputs");
    }
}
class Apple extends Computer{
    double priceInGBP;

    public Apple(String operatingSystem, String processor, String color, double priceInGBP) {
        super(operatingSystem, processor, color);
        this.priceInGBP =priceInGBP;
    }
    void storage()
    {
        System.out.println("I have a maximum memory size of 2TB");
    }
    void audio()
    {
        System.out.println("I've got my speakers from Apple Inc");
    }
}
class Lenovo extends Computer{
    double weightInKg;
    public Lenovo(String operatingSystem, String processor, String color, double weightInKg) {
        super(operatingSystem, processor, color);
        this.weightInKg = weightInKg;
    }
    void storage()
    {
        System.out.println("I have a maximum memory size of 1TB");
    }
    void audio()
    {
        System.out.println("I've got my speakers from Legend Holdings");
    }
}
class HP extends Computer{
    String style;
    public HP(String operatingSystem, String processor, String color, String style) {
        super(operatingSystem, processor, color);
        this.style=style;
    }
    void audio()
    {
        System.out.println("I've got my speakers from B & O");
    }
    void keyboard()
    {
        System.out.println("I've got an illuminated keyboard");
    }
}
class Dell extends Computer{

    public Dell(String operatingSystem, String processor, String color) {
        super(operatingSystem, processor, color);
    }
    void audio()
    {
        System.out.println("I've got my speakers from Dell inc");
    }
}
class ComputerTester{
    public static void main(String[] args) {
        Computer [] computers={new Apple("Mac", "M2 Pro", "Silver",2999.99),
                new Lenovo("Windows", "core i5", "Black", 1.36),
                new HP("Windows","core i7", "Silver","Sleek"),
                new Dell("Windows", "core i5", "Pink")
        };
        for (Computer computer:computers){
            computer.storage();
            computer.keyboard();
            computer.audio();
        }
    }
}