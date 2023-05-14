package Class21;

public class Refresher1 {
    public static void main(String[] args) {
        Dog1[] dogs={new Dog1("Tata", "White", "Mastif"), new Dog1("Koko", "Brown", "Buabel")};
        for (Dog1 dog:dogs){
            dog.printInfo();
        }
    }
}
