package ReplitAssignment;

public class A161Overload {
    private void m1(String x){
        System.err.println(x);
    }
    private void m1(){
        System.err.println("private m1 method with int parameter");
    }
    public static void main(String[] args){
        A161Overload overload=new A161Overload();
        overload.m1("private m1 method");
        overload.m1();
    }
}