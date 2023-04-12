package ReplitAssignment;

import java.util.Scanner;

public class A65 {
    /*
      Given the following inputs:

```
int x;
```

Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.

Sample input/outputs:

```
In: 7
6 5 4 3 2 1 0
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int answer=input.nextInt();
        for (int a=answer-1; a>=0; a--)
            System.out.print(a+" ");

    }
}
