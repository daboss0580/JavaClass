package ReplitAssignment;

public class Person {
    String firstName;
    String lastName;
    int age;
    public Person(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    void printInfo(){
        System.out.println(firstName+" "+lastName+" "+age);
    }
}
class Employee extends Person{
    int salary;
    public Employee(String firstName, String lastName, int age, int salary){
        super(firstName, lastName, age);
        this.salary=salary;
    }
    void printInfo(){
        super.printInfo();
        System.out.println(salary);

    }
}
class Tester extends Person{
    String programmingLanguage;
    public Tester(String firstName, String lastName, int age, String programmingLanguage){
        super(firstName, lastName,age );
        this.programmingLanguage=programmingLanguage;

    }
    void printInfo(){
        super.printInfo();
        System.out.println(programmingLanguage);
    }


}

class PersonTester{
    public static void main(String[] args){
        Employee employee=new Employee("Joe", "Smith", 35, 35000);
        Tester tester=new Tester("Adam", "Smith", 15,"java");
        employee.printInfo();
        tester.printInfo();
    }
}
