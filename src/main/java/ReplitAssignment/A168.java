package ReplitAssignment;

public class A168 {
    /*
    Create an instance final method that will reverse a String and return that new String
Call method from the main method
**Expected Output:**
olleh
     */
    public final String reverseString(String x) {
        StringBuilder y = new StringBuilder(x);
        return y.reverse().toString();
    }
}
class A168Tester{
    public static void main(String[] args) {
        A168 a168=new A168();
        String answer=a168.reverseString("hello");
        System.out.println(answer);
    }
}