package ReplitAssignment;

public class A131 {
    /*
    Write a method header on line two with the following specs:
Returns:
a String
Name:```
thirdLetter
Parameters:
a String called s
Then complete the method by programming the following behavior
Returns every 3rd letter of the String s,
starting from the first letter.
     */
    static String thirdLetter(String s){
        String returned="";
        for (int a=0; a<s.length();a+=3){
            returned=returned+s.charAt(a);
        }

        return returned;
    }
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
