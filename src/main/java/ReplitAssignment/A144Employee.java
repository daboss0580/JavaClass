package ReplitAssignment;

public class A144Employee {
    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;

     void display(){
         name ="null";
         lastName="null";
         employeeId=0;
         startDate="null";
         salary=0;
        System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
    }

    A144Employee(String name, String lastName, int employeeId, String startDate, int salary){
        this.name=name;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;
    }
    void printInfo(){
        System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
    }
}

class A144EmployeeTester{
    public static void main(String[] args) {
        A144Employee employee = new A144Employee("Joe", "Smith", 12345 ,"01/01/1970", 35000);
        A144Employee employee1 = new A144Employee("Joe", "Smith", 12345 ,"01/01/1970", 35000);
        employee.display();
        employee1.printInfo();

    }
}
