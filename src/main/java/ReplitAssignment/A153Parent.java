package ReplitAssignment;

public class A153Parent {
    public A153Parent(){

    }
    void printInfo(){
        System.out.println("This is Parent constructor");
    }
    static class A153Child extends A153Parent{
        void printInfo(){
super.printInfo();
        }
    }

}
class A153Tester{
    public static void main(String[] args) {
        A153Parent.A153Child child =new A153Parent.A153Child();
        child.printInfo();
    }
}
