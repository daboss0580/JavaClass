package ReplitAssignment;

public class A152Parent {
    /*
    In Parent class.
Create a constructor, it will take a String parameter called city.
include the logic of printing the parameter value.
Create another constructor without parameter.
Include the logic of printing "Parent Constructor".
Create a Child Class that should be a subclass of Parent class
Inside child class create a constructor that will make a call to parameterized constructor of the parent class.
In Main class.
Create an Object of the child class by passing String value "Vienna"
**Expected Output:**
Vienna
     */
    String city;
    public A152Parent(String city) {
        this.city=city;

    }

    void printInfo(String city) {
        System.out.println(city);
    }
    public A152Parent() {
    }

    static class A152Child extends A152Parent {
        void printInfo(String city){
            super.printInfo("Vienna");
        }
    }

}

class A152Tester{
    public static void main(String[] args) {
        A152Parent.A152Child child=new A152Parent.A152Child();
        child.printInfo("Vienna");

    }

}

