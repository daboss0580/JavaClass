package ReplitAssignment;

public class A72 {
    public static void main(String[] args){
        /*
        **For you to do:**
Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x}
Print the values so the output should look like below
**Output:**
syntax
         */
        char [] letters={'s', 'a', 'y',  'b', 'n', 'c', 't',  'd', 'a', 'e', 'x'};
        for (int a=0; a<letters.length; a+=2){
            System.out.print(letters[a]);
        }
    }
}
