package GroupExcercise;

public class Task2 {
    public static void main(String[] args) {
        String word="Madam";
        String word1=word.toLowerCase();
        String reverse="";
        for (int i=word1.length()-1; i>=0;i-- ){
            reverse=reverse+word1.charAt(i);

        }
        if (word1.equals(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }


    }
}
