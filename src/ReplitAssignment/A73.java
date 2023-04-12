package ReplitAssignment;

public class A73 {
    public static void main(String[] args){
        /*
        *For you to do:**
Write a program that creates an array of strings with the following values{"This", "is", "array", "of", "strings"} and prints all values in one line.
**Output:**
This is array of strings
         */
        String [] sentence={"This", "is", "array", "of", "strings"};
        for (int a=0; a<sentence.length; a++){
            System.out.print(sentence[a]+" ");
        }
    }
}
