package Class11;

public class E22DArray {
    public static void main(String[] args) {
        String [][] animals={{"Dog", "Cat", "Sheep", "Goat"},
                {"Lion", "Tiger", "Monkey", "Fox"}};
        for (int row=0; row<animals.length; row++){
            for (int col=0; col<animals[row].length; col++){
                System.out.println(animals[row][col]);
            }

        }

    }
}
