package ReplitAssignment;

import java.util.Scanner;

public class A36 {
    public static void main(String[] args) {
        /*

       **For you to do:**

Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"

and make the comparisons:

- if int1 and int2 are equal **and** word1 and word2 are equal, output "AND"
- if int1 and int2 are equal **or** word1 and word2 are equal, output "OR"
- if int1 and int2 are **not** equal **and** word1 and word2 are **not** equal, output "NONE"

```
**Example input/output:**
word1: banana
word2: banana
int1: 2
int2: 2
Output: AND
```

```
word1: banana
```

```
word2: apple
```

```
int1: 2
```

```
int2: 2
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String answer1 = input.next();
        System.out.println("Please enter another word");
        String answer2 = input.next();
        System.out.println("Please enter any number");
        int number1 = input.nextInt();
        System.out.println("Please enter another number");
        int number2 = input.nextInt();

            if (number1 == number2 && answer1.equals(answer2)) {
                System.out.println("AND");
            } else if (number1 == number2 || answer1.equals(answer2)) {
                System.out.println("OR");
            } else System.out.println("NONE");

        }


    }
