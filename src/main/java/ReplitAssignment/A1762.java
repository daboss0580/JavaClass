package ReplitAssignment;

public interface A1762 extends A176 {
    /*
    Step 1: Create Parent Interface as ParentInterface that will have undefined method parentMethod without parameters.
Step 2: Create an Interface as ChildInterface that will be a child interface of Parent Interface and will have a method childMethod without parameters.
Step 3: Inherit the Main class to Child Interface.
Step 4: Execute both methods
**Expected Output:**
Parent Method-welcome to Syntax
Child Method-hello Syntax
     */
    public void childMethod();

}
class A176Test implements A1762{
    public void parentMethod(){
        System.out.println("Parent Method-welcome to Syntax");
    }
    public void childMethod(){
        System.out.println("Child Method-hello Syntax");
    }

    public static void main(String[] args) {
        A176Test test=new A176Test();
        test.parentMethod();
        test.childMethod();

    }
}
