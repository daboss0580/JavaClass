package ReplitAssignment;

public class A122 {
    static void printInfo(String country, String capital, int population){
        System.out.println("The capital of "+country+" is "+capital+" DC and population is "+population);
    }
    public static void main(String[]args){
        A122 main=new A122();
        main.printInfo("USA", "Washington", 330000000);
    }
}
