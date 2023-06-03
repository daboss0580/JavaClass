package ReplitAssignment;

import java.util.Scanner;

public class A64 {

    public static void main(String[] bars){
        /*
        **For you to do:**

You should input:

```
int end;
```

Write a for loop that will print out a series of numbers starting at 0 and ending at the doubled value of
* end(value must be taken from a user), exclusive.

Each number should be on the same line, separated by a space.

 **Example Output:**

```
Int: 5
0 1 2 3 4 5 6 7 8 9
```
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int userInput=scanner.nextInt();

        for(int i=0;i< userInput*2; i++){
            System.out.print(i+" ");
        }

    }
}
