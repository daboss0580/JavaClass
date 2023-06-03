package ReplitAssignment;

public class A126 {
    /*
    Create a variable that will hold the count of all instances of the Main class

Create 3 Object of the class and print value of the count variable;
     */
    static int count;

    public static void main(String[] args) {
        A126 x=new A126();
        count++;
        A126 y=new A126();
        count++;
        A126 z=new A126();
        count++;
        System.out.println(count);
    }
}
