package Class15;

public class E1MethodsTask3 {
    static void given(String word) {
        String reverse = "";
        for (int a = word.length() - 1; a >= 0; a--) {
            reverse += word.charAt(a);

        }
        if (reverse.equals(word))
        {
            System.out.println(word + " is palindrome");
        }
        else
        {
            System.out.println(word + " is not palindrome");
        }

    }

    public static void main(String[] args) {
        given("madame");
    }
}
