package Class23;

import static Class23.Sellable.sell;

public interface Sellable {
    static void sell(){
        System.out.println("Allowed");
    }
}
class SellableTester{
    public static void main(String[] args) {
        sell();
    }
}