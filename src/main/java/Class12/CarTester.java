package Class12;

public class CarTester {
    public static void main(String[] args) {
        Car benz=new Car();
        benz.make="Mercedes";
        benz.colour="White";
        benz.gearbox="Automatic";
        benz.lengthInCm=250;
        benz.widthInCm=175.4;
        benz.weightInTonnes =1.25;

        benz.rev();
        benz.honk();

    }
}
