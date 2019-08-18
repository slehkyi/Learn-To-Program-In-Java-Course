import java.util.Scanner;
/*
    Write a program using recursion to find the sum of the series upto a limit as given by the user.
    11 + 22 + 33 + 44 + ……. + NN
 */
public class Recursion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = sumOfInts(num);
        // Write the logic here
        System.out.println(sum);

    }

    private static int sumOfInts(int num) {
        if (num == 1) {
            return 11;
        } else {
            return num*11 + sumOfInts((num-1));
        }
    }
}
