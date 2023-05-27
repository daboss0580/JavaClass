package ReplitAssignment;

public class A137 {
    /*
In main class please declared the variables using different access modifiers
that will hold value for:
- name
- city
- name of the school
- batch number
Create a method to display details in following format:
My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_
Assign values to the variables and execute method display
     */
    private static String name="John";
    static String city="Miami";
    protected static String nameOfSchool="Syntax";
    public static int batchNo=9;
    static void printInfo(){
        System.out.println("My name is "+name+" and I live in "+city+". I study at "+nameOfSchool+" in batch "+batchNo);
    }
    public static void main(String[] args){
        printInfo();
    }
}
