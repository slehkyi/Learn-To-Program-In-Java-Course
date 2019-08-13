import java.util.Scanner;
/*
    Write a program to print sum of digits from 1 to N using a for loop where N is a positive non-zero integer.
 */

public class SumOfDigits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of all digits from 0 to " + num + " is " + sum);
    }
}
