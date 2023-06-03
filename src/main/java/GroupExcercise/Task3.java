package GroupExcercise;

public class Task3 {
    public static void main(String[] args) {
        String word="Count the Number of Words in a     String";
        int counter=1;
        for (int i=0; i<word.length(); i++){
            if ((word.charAt(i)==' ') && (word.charAt(i+1)!=' ')){
                counter++;
            }

        }System.out.println(counter);

    }
}
