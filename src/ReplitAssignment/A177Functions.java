package ReplitAssignment;

public interface A177Functions extends A177Output {
    double adding(double firstNumber , double secondNumber);
    double subtracting(double firstNumber , double secondNumber);
    double multiply(double firstNumber , double secondNumber);
    double dividing(double firstNumber , double secondNumber);

}
class A177Test implements A177Functions{
    public void display1(double result){

    }
   public double adding(double firstNumber , double secondNumber){
        double add=firstNumber+secondNumber;
        return add;

    }
    public double subtracting(double firstNumber , double secondNumber){
        double subtract=firstNumber-secondNumber;
        return subtract;
    }
    public double multiply(double firstNumber , double secondNumber){
        double multiply=firstNumber*secondNumber;
        return multiply;
    }
    public double dividing(double firstNumber , double secondNumber){
        double divide=firstNumber/secondNumber;
        return divide;
    }
}
