package ReplitAssignment;

public class A162Overload {
    /*
    Overload static method and then execute both overloaded methods.
**Expected Output:**
static method without parameter
static method with int parameter
     */
    static void overload(){
        System.out.println("static method without parameter");
    }
    static void overload(String x){
        System.out.println("static method with int "+x);
    }

    public static void main(String[] args) {
        overload();
        overload("parameter");
    }
}
