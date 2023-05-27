package ReplitAssignment;

public class A142 {
    /*
    Include the following class variables:
* schoolName(String)
* batch(int)
* year(int)
* lastDayOfClass(String)
Write two constructors:
* non-argument constructor
* parameterized constructor
Create method to display values of instance variables.
**2. In Main Class:**
Create two different objects of the SyntaxTechnologies class using both constructors and call display method.
**Expected Output:**
null 0 0 null
Syntax 6 2020 07/30/2020
     */
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;
    void display(){
        schoolName=null;
        batch=0;
        year=0;
        lastDayOfClass=null;
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }

   A142(String schoolName, int batch, int year, String lastDayOfClass){
       this.schoolName=schoolName;
       this.batch=batch;
       this.year=year;
       this.lastDayOfClass=lastDayOfClass;
   }

    void printInfo(){

       System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
   }

}
class A142Tester{
    public static void main(String[] args) {

        A142 test=new A142("Syntax", 2,2020,"07/30/2020");
        test.display();
        A142 test1=new A142("Syntax", 2,2020,"07/30/2020");
        test1.printInfo();

    }
}
