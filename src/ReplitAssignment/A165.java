package ReplitAssignment;

public class A165 {
    public void display(){
        System.out.println("I am parent public method");
    }
    protected void display1(){
        System.out.println("I am parent protected method");
    }
    void display2(){
        System.out.println("I am parent default method");
    }
    private void display3(){
        System.out.println("I am parent private method");
    }
}
class A165Child extends A165 {
    public void display(){
        System.out.println("I am child public method");
    }
    protected void display1(){
        System.out.println("I am child protected method");
    }
    void display2(){
        System.out.println("I am child default method");
    }
    private void display3(){
        System.out.println("I am child private method");
    }
}
class A165Tester{
    public static void main(String[] args) {
A165Child child=new A165Child();
child.display();
child.display1();
child.display2();
    }
}