package HW280523;

import java.util.Map;
import java.util.TreeMap;

public class Person {
    /*
    Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.

In Test Class create a Map that will store key in ascending order. In that map store
personId and a Person Object. Print each object details.
     */
    private String name;
    private String lastName;

    private Integer age;
    private Double salary;

    public Person(String name, String lastName, Integer age, Double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void details(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class PersonTester{
    public static void main(String[] args) {
        Map<Integer, Person> entry=new TreeMap<>();
        entry.put (1,(new Person("John","Bolton",32,35000.00)));
        entry.put (2,(new Person("Tony","Ballard",38,38900.50)));
        entry.put (3,(new Person("Lindsey","Houston",29,40000.90)));
        entry.put (4,(new Person("Kenny","Harold",45,43000.00)));
        entry.put (5,(new Person("Kelly","Clive",50,37000.00)));
        entry.put (6,(new Person("Paul","Clooney",24,33000.00)));
        for (Person people:entry.values()){
            people.details();
        }
    }
}