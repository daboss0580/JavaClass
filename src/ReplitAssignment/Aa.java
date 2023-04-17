package ReplitAssignment;

public class Aa {
    public static void main(String[] args) {
 int [] number= {34,76,45,88,54,97,54,77,4,90,44,7,5,44};
 int largest=number[0];
 for (int a: number){
     if (a>largest){
         largest=a;

     }
 }
        System.out.println(largest);
    }
}
