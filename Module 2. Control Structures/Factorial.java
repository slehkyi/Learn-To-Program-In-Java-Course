import java.util.Scanner;

/*
Write a program to find the factorial of a number using while loop
 */
public class Factorial
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        while (num > 1) {
            factorial *= num;
            num--;
        }
        System.out.println(factorial);
    }
}
