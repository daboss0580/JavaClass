package ReplitAssignment;

public class A120Methods {
    /*
    Declare 3 instance variables to hold:
year, school name and batch #
Access variables from the main method and assign specific values to them
Print values of your variables in the following format:
**Expected Output:**
I am a student of batch 9 studying at Syntax in the year of 2021
     */
    void printInfo(int year, String school, int batch){
        System.out.println("I am a student of batch "+batch+" studying at "+school+" in the year of "+year);
    }

    public static void main(String[] args) {
        A120Methods a120Methods=new A120Methods();
        a120Methods.printInfo(2021,"Syntax",9);
    }

}
