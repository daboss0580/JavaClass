package ReplitAssignment;

import static ReplitAssignment.A169.avgElements;

public class A169 {
  public final static double avgElements(int [] a){
      double avgElements=0;
      double sum=0;
     for (int i=0; i<a.length;i++){
         sum=sum+a[i];
         avgElements=sum/a.length;
     }return avgElements;
 }
}
class A169Tester{
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a));


    }
}

