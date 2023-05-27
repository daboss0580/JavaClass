package ReplitAssignment;

public class A125 {
    /*
    Declare a static variable **number** that will hold an integer value:
Access **number** from the main method and assign value to it.
Create an Object of the class, access **number** in a nonstatic way and assing value of 200.
Print out **number** using class name and using instance
     */
    static int number;

    public static void main(String[] args) {
        number=200;
        System.out.println(number);
        A125 num=new A125();
        num.number=200;
        System.out.println(num.number);
    }
}