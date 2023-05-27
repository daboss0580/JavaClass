package ReplitAssignment;

public class A173 {
    /*
    Create a Super Class Tea that will have:
- instance variable teaType;
- constructor that will initialize
- unimplemented method addSugar(),
Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
In main class create an object of 2 Child and assign them to Parent reference type.
Execute method addSugar from both classes.
**Expected Output:*
For Lemon Tea we need 2 spoons of sugar
For Chai Tea we need 1 spoon of sugar
     */
    String teaType;
    A173(String teaType){
        this.teaType=teaType;
    }
    void addSugar(){
        System.out.println("Tea is ready");
    }
}
class LemonTea extends A173{
    public LemonTea(String teaType){
        super(teaType);
    }
    void addSugar() {
        System.out.println("For Lemon Tea we need 2 spoons of sugar");
    }
}
class ChaiTea extends A173{
    public ChaiTea(String teaType) {
        super(teaType);
    }
    void addSugar() {
        System.out.println("For Chai Tea we need 1 spoon of sugar");
    }
}
class A173Tester{
    public static void main(String[] args) {
        LemonTea lemonTea=new LemonTea("Lemon Tea");
        ChaiTea chaiTea=new ChaiTea("Chai Tea");
        lemonTea.addSugar();
        chaiTea.addSugar();

    }
}