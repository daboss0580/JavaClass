package ReplitAssignment;

public abstract class A172 {
    /*
    Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1
Make Main class to be a derived class from Parent.
In main method execute both methods
**Expected Output:**
Child class providing implementation
Parent class providing implementation
     */
    public abstract void m1();
    void m2(){
        System.out.println("Parent class providing implementation");
    }
}
class A172Child extends A172{

    @Override
    public void m1() {
        System.out.println("Child class providing implementation");
    }
}
class A172Tester{
    public static void main(String[] args) {
        A172Child child=new A172Child();
        child.m1();
        child.m2();
    }
}