import java.util.Scanner;
/*
    Write a program to find out square root of a number rounded to two decimal places using Math functions
 */
public class MathFun
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter an integer: ");
        int num = sc.nextInt();
        // write the logic to find the square root of the given number
        double root = Math.sqrt(num);
        double rounded = (double) Math.round(root * 100.0) / 100.0;
        System.out.println("Rounded value is...." + rounded);
    }
}