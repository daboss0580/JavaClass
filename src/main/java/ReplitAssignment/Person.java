package ReplitAssignment;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void printInfo() {
        System.out.print(firstName + " " + lastName + " " + age+" ");
    }
}

 class Employee extends Person {

    int salary;
    public Employee(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }
    public Employee(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }
    public void printInfo() {
        super.printInfo();
       // System.out.print(" " + salary);
    }
    //public abstract int salary(int salary);
    /* public int salary(int salary){

        return salary;
     }*/
     public void salary2(int salary){
         System.out.println(salary);
     }

}
class Tester extends Employee {
    String programmingLanguages;

    public Tester(String firstName, String lastName, int age, String programmingLanguages) {
        super(firstName, lastName, age);
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(" " +  programmingLanguages);
    }
}
class PersonTester{
    public static void main(String[] args){
        Employee employee=new Employee("Joe", "Smith", 35, 35000);
        Tester tester=new Tester("Adam", "Smith", 15, "java");
        employee.printInfo();
        employee.salary2(employee.salary);
      // System.out.print(employee.salary(employee.salary));
        System.out.println();
        tester.printInfo();


    }
}
