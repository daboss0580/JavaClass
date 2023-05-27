package ReplitAssignment;

public class A159 {
    /*
    Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
In main method execute all 3 methods to match the output:
Expected Output
40 (should come from subtracting 4 numbers)
30 (should come from subtracting 3 numbers)
20 (should come from subtracting 2 numbers)
     */
    public void subtract(int a, int b, int c, int d){
        System.out.println(d-c-b-a+ " (should come from subtracting 4 numbers)");
    }
    public void subtract(int a, int b, int c){
        System.out.println(c-b-a+ " (should come from subtracting 3 numbers)");
    }
    public void subtract(int a, int b){
        System.out.println(b-a+ " (should come from subtracting 2 numbers)");
    }
}
class A159Main{
    public static void main(String[] args) {
        A159 answers=new A159();
        answers.subtract(20,10,30,100);
        answers.subtract(20,40,90);
        answers.subtract(50,70);
    }
}