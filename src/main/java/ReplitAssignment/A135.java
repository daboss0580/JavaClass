package ReplitAssignment;

public class A135 {
    /*
    Write a method with the following specs:
Returns:
a String
Name:
surround
Parameters:
a String called s
a String called search_term
Then complete the method by programming the following behavior
Return a new String built from s that has every instance of the search term surrounded by parentheses
See below examples.
Examples:
surround("abcabcabc",'c') ==> "ab(c)ab(c)ab(c)"
surround("technology",'o') ==> "techn(o)l(o)gy"
 */
    static String surround(String s, String search){

           return  s.replace(search, "("+search+")");



    }

    public static void main(String[] args) {
        System.out.println(surround("open","e"));
        System.out.println(surround("abcabcabc","c"));
    }
}
