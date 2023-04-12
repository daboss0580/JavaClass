package ReplitAssignment;

public class A68 {
    public static void main(String[] args) {
        /*
        **For you to do:**

Write a program to print out the pattern:

 **Expected output:**

```
$$$$
```

```
$  $
```

```
$  $
```

```
$$$$

            System.out.print("$$$$");
            System.out.println();
            System.out.print("$ " + " $");
            System.out.println();
            System.out.print("$ " + " $");
            System.out.println();
            System.out.print("$$$$");*/
        for (int a = 1; a <= 1; a++) {
            for (int b = 0; b < 4; b++) {
                System.out.print("$");

            }
            System.out.println();
        }
        for (int a = 1; a <= 2; a++) {
            for (int b = 1; b <= 2; b++) {
                System.out.print("$" + "  ");

            }
            System.out.println();
        }
        for (int a = 1; a <= 1; a++) {
            for (int b = 0; b < 4; b++) {
                System.out.print("$");
            }
        }
    }
}