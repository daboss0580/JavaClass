package ReplitAssignment;

public class A128 {
    /*
    Create a static method with the following specification
Return Type: String
Method Name: mixString
Parameters:
- a String called s1
- a String called s2
Then inside method write logic that will return the strings combined, one letter at a time, starting with s1.  See example below for an example.
     */
    static String mixString(String s1, String s2) {
        String returnedSt="";
        for (int a=0; a<s1.length(); a++){
            returnedSt=returnedSt+s1.charAt(a)+s2.charAt(a);

    }
        return returnedSt;
}

    //test case below (dont change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }
}


