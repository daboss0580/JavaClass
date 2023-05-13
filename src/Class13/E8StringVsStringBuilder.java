package Class13;

public class E8StringVsStringBuilder {
    public static void main(String[] args) {
        StringBuilder data=new StringBuilder("Java");
        System.out.println(data.reverse());
        String data1="Justin";
        StringBuilder data2=new StringBuilder(data1);
        System.out.println(data2);
        data2.reverse();
        System.out.println(data2);
        String data3=new String(data2);
        System.out.println(data3);
    }
}
