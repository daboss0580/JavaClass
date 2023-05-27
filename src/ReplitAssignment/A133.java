package ReplitAssignment;

public class A133 {
    static int countA(String s){
        int count =0;
        String b;
        for (int a= 0; a<s.length(); a++){
           b= s.toLowerCase();
           if (b.charAt(a)=='a'){
               count++;
           }

        }
        return count;
    }


    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}
