package ReplitAssignment;

public class A117Methods {
/*
Create a method with the following specs:
Returns:
an integer
Name:
sumEvenToX
Parameters:
an integer called "x"
Purpose:
calculate the sum of the EVEN integers from 1 to x (including x)
 */
    static void add(int x ){
        int sumEvenToX=0;
        for (int a=0; a<=x; a++){
            if (a%2==0){
                sumEvenToX=sumEvenToX+a;


            }


        }System.out.println(sumEvenToX);
    }

    public static void main(String[] args) {

        add(5);
    }
}
