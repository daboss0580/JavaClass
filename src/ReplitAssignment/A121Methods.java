package ReplitAssignment;

public class A121Methods {
    /*
  declare 3 instance variables to hold an integer, double and char values.

Create 2 instances of the class and assign values to variables and the print them
     */
    void printInfo(int x, double y, char z){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public static void main(String[] args) {
        A121Methods a121Methods=new A121Methods();
        a121Methods.printInfo(20,15.2,'b');
        a121Methods.printInfo(127,19.23764,'y');
    }

}
