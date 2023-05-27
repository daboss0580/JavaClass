package ReplitAssignment;

public class A147CarObject {
    String model;
    double price;
    int quantity;
    A147CarObject(String model){
        this.model=model;

    }
    void carStockValue(double price,int quantity){
        double carStockValue=price*quantity;
        System.out.println(model+" Stock Value "+carStockValue);
    }

    }


class A147CarObjectTester{
    public static void main(String[] args) {
        A147CarObject carObject=new A147CarObject("Toyota 2019");
        A147CarObject carObject1=new A147CarObject("Mercedes Benz 2021");
        carObject.carStockValue(25000,100);
        carObject1.carStockValue(87999.99,15);
    }

}
