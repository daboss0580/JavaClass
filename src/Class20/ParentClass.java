package Class20;

public class ParentClass {
    void getMarried()
    {
        System.out.println("Marry the girl of your choice");
    }
}
class Justin extends ParentClass{
    void getMarried()
    {
        System.out.println("Not ready yet");
    }


}
class Test{
    public static void main(String[] args) {
        Justin just=new Justin();
        just.getMarried();
    }
}
