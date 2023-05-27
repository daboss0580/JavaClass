package GroupExcercise;

public class Task1 {
    /*
    Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH"
     */
    public static void main(String[] args) {
        //Using loop
        String word="Hello";
        String reverse="";
        for (int i=word.length()-1; i>=0;i--){
            reverse=reverse+word.charAt(i);
        }System.out.println(reverse);

        System.out.println("********************************************");

        //Using StringBuilder class
        String word1="Hello";
        StringBuilder wrd=new StringBuilder(word1);
        StringBuilder newWord=wrd.reverse();
        String revWord=new String(newWord);
        System.out.println(revWord);


    }

}
