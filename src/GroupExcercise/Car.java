package GroupExcercise;

public abstract class Car {
    /*
    Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount
     */
    double carPrice;
    String color;

    public double calculateSalePrice(double carPrice) {
        return carPrice;
    }
}
class Sedan extends Car{
    private double lengthInFeet;

    public void setLengthInFeet(double lengthInFeet) {
        this.lengthInFeet = lengthInFeet;
    }

    @Override
    public double calculateSalePrice(double carPrice) {
        double discountPrice=0;
        if (lengthInFeet>20){
             discountPrice=carPrice*0.95;
        }else {
             discountPrice=carPrice*0.9;
        }return discountPrice;
    }
}
class Truck extends Car{
    private double weightInTonnes;

    public void setWeightInTonnes(double weightInTonnes) {
        this.weightInTonnes = weightInTonnes;
    }

    @Override
    public double calculateSalePrice(double carPrice) {
        double discountPrice;
        if (weightInTonnes>2000){
            discountPrice=carPrice*0.9;
        }else {
            discountPrice=carPrice*0.8;
        }return discountPrice;
    }
}
class CarTester {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        Truck truck = new Truck();
        sedan.setLengthInFeet(21);
        truck.setWeightInTonnes(1000);
        System.out.println(sedan.calculateSalePrice(23499.99));
        System.out.println(truck.calculateSalePrice(89489.99));
    }
}