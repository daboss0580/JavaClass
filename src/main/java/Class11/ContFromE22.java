package Class11;

public class ContFromE22 {
    public static void main(String[] args) {
        String [][] animals={{"Dog", "Cat", "Sheep", "Goat"},
                {"Lion", "Tiger", "Monkey", "Fox"}};
        for (String [] ab:animals){
            for (String anim:ab){
                System.out.println(anim);
            }
        }
    }
}
