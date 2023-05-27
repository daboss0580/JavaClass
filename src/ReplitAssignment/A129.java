package ReplitAssignment;

public class A129 {
    /*
    Declare two static variables to hold
- country name
- continent
Create a method to display the value of static variables in the following format:
____ located on \_\_\_\_ continent
In the main method assign values to a static variable and execute method display
     */
    static String countryName="Nigeria";
    static String continent="Africa";
    static void printInfo(){
        System.out.println(countryName+" is located on "+continent+" continent");
    }

    public static void main(String[] args) {
        printInfo();
    }
}
