package ReplitAssignment;

public interface A175 {
    /*
    Step1: Create Interface as FirstInterface and create undefined method as firstMethod (without parameter)
Step 2: Create another interface as SecondInterface in which create a method as secondMethod (Without Parameter)
Step 3: Inherit both interfaces to Main class.
Step 4: Execute both methods
**Expected Output:**
First Method implementing multiple Inheritance
Second Method implementing multiple Inheritance
     */
    void firstMethod();

}
class A175Tester implements A175, A1752{
    public void firstMethod(){
        System.out.println("First Method implementing multiple Inheritance");
    }
    public void secondMethod(){
        System.out.println("Second Method implementing multiple Inheritance");
    }

    public static void main(String[] args) {
        A175Tester test=new A175Tester();
        test.firstMethod();
        test.secondMethod();
    }
}