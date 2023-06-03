package Class25;

import java.util.ArrayList;

public class E1Arraylist {
    public static void main(String[] args) {
        Car car1=new Car("Toyota", "Camry");
        Car car2=new Car("Mercedes Benz", "GLE 450");
        Car car3=new Car("BMW", "iX");
        Car car4=new Car("Rolce Royce", "Phantom");
        ArrayList<Car>cars=new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        for (Car car:cars){
            car.printInfo();
        }

    }
}
class Car{
    String make;
    String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    void printInfo(){
        System.out.println(make+" "+model);
    }
}
