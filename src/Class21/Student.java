package Class21;

public class Student {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */
    void read(){
        System.out.println("We read everyday");
    }
    void exams(){
        System.out.println("We write exams every end of semester");
    }
    void eat(){
        System.out.println("We eat lunch");
    }
}
class SyntaxStudent extends Student{
    void read(){
        System.out.println("We do Java everyday");
    }
    void exams(){
        System.out.println("We write Quizzes every end of semester");
    }
}
class CollegeStudent extends Student{

}
class SchoolStudent extends Student{

}
class StudentTester{
    public static void main(String[] args) {
        Student [] students= {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student student:students){
            student.eat();
            student.read();
            student.exams();




            Animal animal=new Cat("Tom","White","Dunno");
            if (animal instanceof Cat){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}