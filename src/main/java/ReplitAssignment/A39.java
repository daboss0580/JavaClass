package ReplitAssignment;

import java.util.Scanner;

public class A39 {
    public static void main(String[] args) {
        /*
        A school has following rules for grading system:
a. 1 to 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask the user to enter marks and print the corresponding grade.

**Example Output:**

```
Please enter your mark
```

```
Your grade is A
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your mark");
        int answer = input.nextInt();
        if (answer >= 1 && answer <= 25) {
            System.out.println("Your grade is F");
        } else if (answer >= 25 && answer <= 45) {
            System.out.println("Your grade is E");
        } else if (answer >= 45 && answer <= 50) {
            System.out.println("Your grade is D");
        } else if (answer >= 50 && answer <= 60) {
            System.out.println("Your grade is C");
        } else if (answer >= 60 && answer <= 80) {
            System.out.println("Your grade is B");
        } else if (answer > 80 && answer <= 100) {
            System.out.println("Your grade is A");
        } else System.out.println("Please enter valid mark");
    }
}