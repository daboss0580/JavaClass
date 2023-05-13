package Class13;

public class Math {
    void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    void minus(int num1, int num2){
        System.out.println(num1-num2);
    }
    void times(int num1, int num2){
        System.out.println(num1*num2);
    }
    void divide(double num1,double num2){
        System.out.println(num1/num2);
    }

    public static void main(String[] args) {
        Math sum=new Math();
        sum.add(40,20);

        Math subtract=new Math();
        subtract.minus(80,10);

        Math multiply=new Math();
        multiply.times(30,3);

        Math divide1=new Math();
        divide1.divide(20,6);
    }


}
