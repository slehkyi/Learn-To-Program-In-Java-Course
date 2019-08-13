import java.util.Scanner;
public class DigitNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Write the logic to check given number is greater or less than the above digit number
        // Write a program to print how many digit’s the number is of as 2, 3- or 4-digit number.
        if (num < 10 && num > -10) {
            System.out.println("1-digit number");
        }
        else if (num < 100 && num > -100) {
            System.out.println("2-digit number");
        }
        else if (num < 1000 && num > -1000) {
            System.out.println("3-digit number");
        }
        else {
            System.out.println("4-digit number or more");
        }
    }
}
