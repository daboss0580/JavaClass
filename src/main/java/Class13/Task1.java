package Class13;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
For Example String str=hello =>l
         */
        String data="Jav";
        if (!data.isBlank() && data.length()%2!=0 &&data.length()>=3){
            int middle=data.length()/2;
            char middleChar=data.charAt(middle);
            System.out.println(middleChar);

        }
    }
}
