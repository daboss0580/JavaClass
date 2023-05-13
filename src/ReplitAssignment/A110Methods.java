package ReplitAssignment;

public class A110Methods {
    /*
    1. Create a method name as newLine that should have print statement inside the method body as "newLine method implementation"

1. Create a method name as displayLine that should have print statement inside the method body as "displayLine method implementation"

3. Call both methods
     */
    public static void newLine(String word){
        System.out.println(word);
    }
    public static void displayLine(String word){
        System.out.println(word);
    }

    public static void main(String[] args) {
        newLine("newLine method implementation");
        displayLine("displayLine method implementation");
    }
}
