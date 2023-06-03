package ReplitAssignment;

public class A156 {
    /*
    Create class A
declare variable int i=10;
Create class B  extends A
declare variable int i=20;
create a method to display value of variable i from both classes
In Main Class create an object of subclass and call method display
**Expected Output:**```
20
10
     */
    int i=10;
    void printInfo(){
        System.out.println(i);
    }
}
class B extends A156{
    int i=20;

    void printInfo(){

        System.out.println(i);
        super.printInfo();
    }

}
class A156Tester{
    public static void main(String[] args) {
        B b=new B();
        b.printInfo();
    }
}
