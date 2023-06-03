package ReplitAssignment;

public class A148ShoppingStore {
    String item;
    double price;
    int quantity;
    A148ShoppingStore(String item){
        this.item=item;

    }
    void itemTotalPrice(double price, int quantity){
        double itemTotalPrice=price*quantity;
        System.out.println(item+" Total Value "+itemTotalPrice);

    }

    }

class A148ShoppingStoreTester{
    public static void main(String[] args) {
        A148ShoppingStore shopping =new A148ShoppingStore("Blanket");
        A148ShoppingStore shopping1 =new A148ShoppingStore("Mattress");
        shopping.itemTotalPrice(99.98, 1);
        shopping1.itemTotalPrice(53.916, 10);
        



    }
}
