package ReplitAssignment;

public class A119Methods {
    /*
    Write a method header with the following specs:
Returns:
a String
Name:
censorLetter
Parameters:
a String
a char
Then complete the method by programming the following behavior
Replace all instances of given character with a "*" within the given String.
See below examples.
     */
    static void censorLetter(String name, String x){
        String b = null;
        for (int a=0; a<name.length(); a++){
            if (b.equals(name.charAt(a))) {
                System.out.println(b.replace("x","*"));

            }
            }
        }



    public static void main(String[] args) {
        censorLetter("computer science","e");
    }
}
