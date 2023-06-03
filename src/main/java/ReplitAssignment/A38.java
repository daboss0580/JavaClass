package ReplitAssignment;

import java.util.Scanner;

public class A38 {
    public static void main(String[] args) {
/*
Prompt user with a question: "Is it weekend?"

If it is not a weekend --> subject="manual testing"

Otherwise --> subject="Java"

**Output**:

```
Today you will be learning ____
```
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean ans = input.nextBoolean();
        if (ans == true) {
            System.out.println("Today you will be learning Java");
        } else System.out.println("Today you will be learning manual testing");
    }
}