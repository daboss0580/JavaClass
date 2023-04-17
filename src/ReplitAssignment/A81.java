package ReplitAssignment;

public class A81 {
    public static void main(String[] args)
    {
        int [] numbers={5,12,8,3,9,4,6};
        int largest=numbers[0];
        for (int a:numbers){
            if (a>largest){
                largest=a;
            }

            }
        System.out.println(largest);
        }

    }

