import java.util.Scanner;

/*
        Write a program using a single if statement with AND (&&), OR (||) and NOT (!) operators
        to check the given number is not divisible by 2 or 3 and that the number is divisible by 5 and 10.
        If meets criteria print “True” or else print “False”.
 */
public class Division
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();
        // Write the logic to check the given number is divisible or not.
        if ((num % 2 != 0 || num % 3 != 0) && (num % 5 == 0 && num % 10 == 0)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
