package ReplitAssignment;

public class A136 {
    private static void printInfo(){
        System.out.println("This is Private Method");
    }
    static void printInfo1(){
        System.out.println("This is Default Method");
    }
    protected static void printInfo2(){
        System.out.println("This is Protected Method");
    }
    public static void printInfo3(){
        System.out.println("This is Public Method");
    }
    public static void main(String[] args){
        printInfo();
        printInfo1();
        printInfo2();
        printInfo3();
    }
}
