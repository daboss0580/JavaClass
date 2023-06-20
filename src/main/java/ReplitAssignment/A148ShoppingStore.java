package ReplitAssignment;

public class A148ShoppingStore {
    String item;
    double price;
    int quantity;
    A148ShoppingStore(String item,double price, int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;


    }
    public double itemTotalPrice(){
        double itemTotalPrice=price*quantity;
        System.out.println(item+"  Total Value "+itemTotalPrice);
        return itemTotalPrice;
    }
    }



class A148ShoppingStoreTester{
    public static void main(String[] args) {
        A148ShoppingStore shopping =new A148ShoppingStore("Blanket",99.98, 1);
        A148ShoppingStore shopping1 =new A148ShoppingStore("Mattress",43.918, 10);
        double blanketTotal=shopping.itemTotalPrice();
        double mattressTotal= shopping1.itemTotalPrice();
        double sum=blanketTotal+mattressTotal;
        System.out.println("You purchased "+sum+" Today");


    }
}
