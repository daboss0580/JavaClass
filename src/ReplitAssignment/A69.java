package ReplitAssignment;

public class A69 {
    public static void main(String[] args){
        for (int a=0; a<6;a++){
            for (int b=1; b<8-a; b++) {
                System.out.print(b+" ");
            }
            System.out.println();
        }
        for (int a=1; a<9; a++){
            if (a==1){
                continue;
            }
            for (int b=1; b<a; b++){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }

}
