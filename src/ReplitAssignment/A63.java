package ReplitAssignment;

import java.util.Scanner;

public class A63 {
    public static void main(String[] args) {
        /*
        Given the following inputs:

```
int x;
```

Write a for loop that will print out a series of numbers starting at 0 and ending at the x(value must be taken from a user), exclusive.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int answer=input.nextInt();
        for (int a=0; a<answer; a++){
            System.out.print(a+" ");
        }
    }
    }

