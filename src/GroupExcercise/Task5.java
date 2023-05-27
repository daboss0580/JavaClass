package GroupExcercise;

public class Task5 {

/*
Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.
 */
        String word;

    char firstNonRepeatingCharacter(String word){
        char character=' ';
        for (int i=0; i<word.length();i++){

            if (word.indexOf(word.charAt(i))==word.lastIndexOf(word.charAt(i))){
                character=word.charAt(i);
                break;
            }
        }return character;

    }

    public static void main(String[] args) {
        Task5 task5=new Task5();
        char answer=task5.firstNonRepeatingCharacter("abracadabra");
        System.out.println(answer);
    }
}
