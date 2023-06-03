package ReplitAssignment;

public class A140 {
    /*
    Create the maxLength method that will accept String array of words and return the word with the largest length.
Method should visible only within same package!
     */
    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};

        System.out.println(maxlength(arr));
        //should print "this is long"
    }
    static String maxlength(String[] arr){
        String maxlength="";
        for (int a=0; a<arr.length; a++) {
            if (arr[a].length() > maxlength.length()) {
                maxlength = arr[a];
            }
        }
        return maxlength;
    }
}



