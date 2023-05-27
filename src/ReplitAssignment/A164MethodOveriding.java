package ReplitAssignment;

public class A164MethodOveriding {
    /*
    Create a method hello() in parent class that will print "method in Parent class" then override  that method is
    3 Subclasses implementing login to print "method in Child1/Child2/Child3 class"
In Main Class create 3 object of the child classes and store in into an array and call method hello():
**Expected Output:**
method in Child1 class
method in Child2 class
method in Child3 class
     */
    void hello(){
        System.out.println("method in Parent class");
    }
}
class Child1 extends A164MethodOveriding{
    void hello(){
        System.out.println("method in Child1 class");
    }
}
class Child2 extends A164MethodOveriding{
    void hello(){
        System.out.println("method in Child2 class");
    }
}
class Child3 extends A164MethodOveriding{
    void hello(){
        System.out.println("method in Child3 class");
    }
}
class A164MethodOveridingTester{
    public static void main(String[] args) {
        Child1 child1=new Child1();
        Child2 child2=new Child2();
        Child3 child3=new Child3();
        child1.hello();
        child2.hello();
        child3.hello();
    }
}