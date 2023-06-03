package ReplitAssignment;

public class A114Methods {
    /*
    Step1: Create three methods that will accept 2 in parameters on integer type
Step2: Write the logic in methods to perform actions below:
The first method for multiplication
The second method for addition
The third method for subtraction
Step3: execute all methods
     */
    public static void add(int a, int b){
        System.out.println("Addition "+(a+b));
    }
    public static void multiply(int a, int b) {
        System.out.println("Multiplication " + (a * b));
    }
    public static void subtract(int a, int b) {
        System.out.println("Subtraction " + (a - b));
    }

    public static void main(String[] args) {
        add(30,45);
        multiply(14,10);
        subtract(89,57);
    }
}
