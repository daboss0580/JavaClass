package ReplitAssignment;

public class A178 {
    /*
    Create Class EncapsulationDemo
create two variable as shown below.
private String empName;
private int empAge;
Create the getter/setter methods for each variable.
In Main Class and main method.
Using setter methods assign the values as "John" and "30"
Using getter methods print the values as below outputs.
**Expected Output:
Employee Name: John
Employee Age: 30
     */
    private String empName;
    private int empAge;


    public void setEmpNameempAge(String empName, int empAge){
       this.empName=empName;
        this.empAge=empAge;
    }
    public void getEmpNameempAge(){
        System.out.println(empName);
        System.out.println(empAge);
    }

}
class A178Test{
    public static void main(String[] args) {
        A178 test=new A178();
        test.setEmpNameempAge("John", 30);
        test.getEmpNameempAge();


    }
}