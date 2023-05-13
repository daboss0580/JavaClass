package ReplitAssignment;

public class A106StringBuilder {
    public static void main(String[] args) {
        StringBuilder a=new StringBuilder("Hello");
        StringBuilder b=new StringBuilder("World");
        String a1=new String(a);
        String b1=new String(b);

        System.out.println((a1+" "+b1).toUpperCase());


    }
}
