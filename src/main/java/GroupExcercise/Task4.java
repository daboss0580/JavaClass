package GroupExcercise;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        String x ="a gEntLeman";
        String y ="eleG   aNt man";
        String a=x.replace(" ","");

        String b=y.replace(" ","");
        String word1=a.toLowerCase();
        String word2=b.toLowerCase();
        char[] wd1=word1.toCharArray();
        char[] wd2=word2.toCharArray();
        Arrays.sort(wd1);
        Arrays.sort(wd2);
        boolean result=Arrays.equals(wd1,wd2);
        if (result==true){
            System.out.println(a+" and "+b+ " are anagrams");
        }else {
            System.out.println(a+" and "+b+ " are not anagrams");
        }
    }
}
