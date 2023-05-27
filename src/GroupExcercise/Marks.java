package GroupExcercise;

 abstract class Marks {
    /*
    We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
     */
    int maths;
    int english;
    int chemistry;
    int biology;
    public Marks(int maths, int english, int chemistry, int biology){
        this.maths=maths;
        this.english=english;
        this.chemistry=chemistry;
        this.biology=biology;
    }
    public Marks(int maths, int english, int chemistry){
        this.maths=maths;
        this.english=english;
        this.chemistry=chemistry;
    }
    abstract double getPercentage();
}
 class A extends Marks{
    public A(int maths, int english, int chemistry){
        super(maths,english,chemistry);

    }
     double getPercentage(){
        double average=(maths+english+chemistry)/3;
        return average;
    }
}
class B extends Marks{
    public B(int maths, int english, int chemistry, int biology){
        super( maths,  english,  chemistry,  biology);
    }

    double getPercentage() {
        double average=(maths+english+chemistry+biology)/4;
        return average;
    }
}

class MarksTester{
    public static void main(String[] args) {
A a=new A(76,64,96);
B b=new B(67,85,70,76);
        System.out.println(a.getPercentage());
        System.out.println(b.getPercentage());

    }
}