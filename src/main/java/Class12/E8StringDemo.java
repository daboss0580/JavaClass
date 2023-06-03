package Class12;

public class E8StringDemo {
    public static void main(String[] args) {
        String sentence="   JAva is Very very easY    ";
        sentence=sentence.trim().toLowerCase();
        System.out.println(sentence);
        System.out.println(sentence.startsWith("java"));
    }
}
