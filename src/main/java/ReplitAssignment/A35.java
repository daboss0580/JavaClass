package ReplitAssignment;

import java.util.Scanner;

public class A35 {
    public static void main(String[] args) {


    /*Create a program that prompt user with question:  "Do you need a loan?"(Use a boolean)

If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"

Based on the score define users eligibility:

- if score is below  600 --> eligibility = "Not eligible"
- if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
- if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
- if score is higher than any other previous values --> eligibility = "Definitely eligible" .

**Output:**

```
The eligibility is ____*/
        Scanner input = new Scanner(System.in);
        System.out.println("Do you need a loan? answer(True or false)");
        boolean ans = input.nextBoolean();
         if (ans==true){System.out.println("What is your credit score?");

    } else System.out.println("Thank you for your time");
        {



                }


                int response = input.nextInt();
                if (response < 600) {
                    System.out.println("The eligibility is not eligible");
                } else if (response > 600 && response <= 700) {
                    System.out.println("The eligibility is maybe eligible");
                } else if (response > 700 && response <= 800) {
                    System.out.println("The eligibility is eligible");
                } else if (response > 800) {
                    System.out.println("The eligibility is definitely eligible");
                } else System.out.println("eligibility is Unknown");
            }
        }


