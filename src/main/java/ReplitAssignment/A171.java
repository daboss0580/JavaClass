package ReplitAssignment;

public abstract class A171 {
    /*
    Create a Parent Class that will have two overloaded abstract methods m1
Make Main class as concrete subclass to Parent Class
In main method call the methods.
**Expected Output:*
m1 without parameters
m1 method with parameter
     */
public abstract void m1();
public abstract void m1(String x);
}
class A171Child extends A171 {
    public void m1() {
        System.out.println("m1 without parameters");
    }
    public void m1(String x) {
        System.out.println("m1 method with parameters");
    }
}
class A171Tester{
    public static void main(String[] args) {
        A171 a171=new A171Child();
        a171.m1();
        a171.m1(" ");
    }
}