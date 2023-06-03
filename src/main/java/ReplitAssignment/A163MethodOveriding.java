package ReplitAssignment;

public class A163MethodOveriding {
    /*
    In Parent Class create a method with name method() that will print  "Parent method"
Override method() in Child class that will print "Child method"
In Main Class create objects of child and parent class and call its method.
**Expected Output:**
Parent method
Child method
     */
    void method(){
        System.out.println("Parent method");
    }

    public A163MethodOveriding() {
    }
}
class A163Child extends A163MethodOveriding{
    @Override
    void method(){
        super.method();
        System.out.println("Child method");
    }
}
class A163ChildTester{
    public static void main(String[] args) {
        A163Child child=new A163Child();
        child.method();
    }
}