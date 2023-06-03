package Class6;

import java.util.Objects;
import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one of these countries (UK, USA, Germany, France, Spain, India, China, Malaysia) input is case sensitive");
        String answer = input.next();
        if (answer.equals("UK"))
        {
            System.out.println("English");}
        else if (Objects.equals(answer, "USA")) {
            System.out.println("English");
        } else if (Objects.equals(answer, "Germany")) {
            System.out.println("Dutch");
        } else if (Objects.equals(answer, "France")) {
            System.out.println("French");
        } else if (Objects.equals(answer, "Spain")) {
            System.out.println("Spanish");
        } else if (Objects.equals(answer, "India")) {
            System.out.println("Hindu");
        } else if (Objects.equals(answer, "China")) {
            System.out.println("Chinese");
        } else if (Objects.equals(answer, "Malaysia")) {
            System.out.println("Bahasa Melayu");
        }else System.out.println("your country is not listed");

        }

    }
