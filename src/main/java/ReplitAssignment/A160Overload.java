package ReplitAssignment;

public class A160Overload {
    /*
    Overload instance method display by having different types of parameters
Inside each method write the logic to print value of the parameter
Call all methods inside your main method


     */
    public void overload(int x, int y){
        System.out.println(x+y);
    }
    public void overload(String x, String y){
        System.out.println(x+" "+y);
    }
    public void overload(double x, double y){
        System.out.println(x+y);
    }
}
   class A160Main{
       public static void main(String[] args) {
           A160Overload overload=new A160Overload();
           overload.overload(24,40);
           overload.overload("Syntax", "Technologies");
           overload.overload(28.20,39.3);
       }
   }
