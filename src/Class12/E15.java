package Class12;

public class E15 {
    public static void main(String[] args) {
        String sentence= "yup we have another class";
        System.out.println(sentence.substring(12));
        System.out.println(sentence.substring(4,11));
        int startIndex=sentence.length()-4;
        System.out.println(sentence.substring(startIndex));
    }

}
