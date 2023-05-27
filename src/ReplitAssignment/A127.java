package ReplitAssignment;

public class A127 {
    /*
Create two methods:
The first method should be a non-static method that will print out the following message:
"Programming is amazing."
The second method should be a static method that will print out the following message:
"Java is awesome."
Execute both methods
     */
    void printInfo(){
        System.out.println("Programming is amazing.");
    }
    static void printInfo1(){
        System.out.println("Java is awesome.");
    }

    public static void main(String[] args) {
        A127 pr=new A127();
        pr.printInfo();
        printInfo1();
    }
}
