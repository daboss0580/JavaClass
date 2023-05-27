package ReplitAssignment;

public interface A174 {
    /*
    Create an Interface with name as MyInterface
Create two undefined methods method1 and method2
Inherit the MyInterface to Main Class.
Execute both methods
**Expected Output:**
implementation of method1
implementation of method2
     */
    void method1();
    void method2();
    }
class A174Child implements A174{

    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");
    }
}
class A174Test{
    public static void main(String[] args) {
        A174Child child=new A174Child();
        child.method1();
        child.method2();
    }
}