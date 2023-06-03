package ReplitAssignment;

public class A134 {
    /*
    Write a method with the following specs:
    Returns:
    an integer
    Name:
    countVowels
    Parameters:
    a String called s
    Purpose:
    count the number of vowels in the string s.  Assume s is all lowercase.
     */
    static int countVowels(String s) {
        int count = 0;
        String b = "";
        for (int a = 0; a < s.length(); a++) {
            b = s.toLowerCase();
            if (b.charAt(a)=='a'||b.charAt(a)=='e'||b.charAt(a)=='i'||b.charAt(a)=='o'||b.charAt(a)=='u'){
                count++;
            }
        }return count;

    }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}
