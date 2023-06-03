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

    static String censorLetter(String x,char y) {
        return x.replace(y,'*');


    }

    public static void main(String[] args) {

        System.out.println(censorLetter("computer science",'e'));
        System.out.println(censorLetter("train",'n'));

    }

}



