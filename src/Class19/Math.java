package Class19;

public class Math {
    static void add(int x,int y){
        System.out.println(x+y);
    }
    static void add(int x,double y){
        System.out.println(x+y);
    }
    static void add(double x,double y){
        System.out.println(x+y);

    }
    static void add(long x,long y){
        System.out.println(x+y);

    }
    static void add(double x,int y) {
        System.out.println(x + y);
    }
    public static void main(String[] args) {
        add(6,8);
        add(49,7.5);
        add(46.5,47.6);
        add(34.4,28);
        add(4959543432l,9485685933l);
    }
}
