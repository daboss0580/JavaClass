package Class6;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        int quiz, midTerm, finalScore;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter quiz score");
        quiz = input.nextInt();
        System.out.println("Enter Mid-term score");
        midTerm = input.nextInt();
        System.out.println("Enter Final score");
        finalScore = input.nextInt();
        int averageScore = quiz + midTerm + finalScore;
        if (averageScore >= 90) {
            System.out.println("Grade A");
        } else if (averageScore >= 70 && averageScore < 90) {
            System.out.println("Grade B");
        } else if (averageScore >= 50 && averageScore < 70) {
            System.out.println("Grade C");
        } else if (averageScore >= 0 && averageScore < 50) {
            System.out.println("Grade F");
        } else System.out.println("Invalid score");
    }
}

