package ReplitAssignment;

public class A124 {
    /*
    Declare static variable in class level as below and assign its value:
String ss="Welcome To Syntax Technologies"
Access variable in the main method and print it using three ways you learned so far
Hint:
first way: By calling directly
Second way: By using the className
Third way: By creating the object of the class
     */
    static String ss="Welcome To Syntax Technologies";
     static void printInfo(){
        System.out.println(ss);
    }


    public static void main(String[] args){
        printInfo();
        System.out.println(A124.ss);
        A124 ans=new A124();
        System.out.println(ans.ss);
    }
}
