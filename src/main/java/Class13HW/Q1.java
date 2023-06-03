package Class13HW;

public class Q1 {
    /*
    Create a String that will hold a sentence. Write a program to get a new String
    without any spaces.
     */
    public static void main(String[] args) {
        String sentence="I use to think coding was difficult";
        System.out.println(sentence.replaceAll(" ",""));
    }
}
