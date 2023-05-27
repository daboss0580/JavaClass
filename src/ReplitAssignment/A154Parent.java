package ReplitAssignment;


public class A154Parent {
     int number;

    A154Parent(){



    }
    void printInfo(int number){
        this.number=number;
        System.out.println(number);

    }
    void printInfo(){

        System.out.println("Parent Constructor without argument");
    }
    static class A154Child extends A154Parent {
        void printInfo(){
            super.printInfo();
            System.out.println("Child Constructor without argument");


        }
    }

}
class A154Tester{
    public static void main(String[] args) {


        A154Parent.A154Child child=new A154Parent.A154Child();
        child.printInfo();
        child.printInfo(10);



    }
}
