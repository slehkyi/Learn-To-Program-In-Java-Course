import java.util.Scanner;
/*
    Write a program to reverse a string using recursive function
 */
public class ReverseStringUsingRecursion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        // Implement the logic to reverse the string using recursion
        reverseString(s1);
    }

    private static String reverseString(String str) {
        if (str.length() == 1) {
            System.out.print(str.charAt(0));
            return Character.toString(str.charAt(0));
        } else {
            System.out.print(str.charAt(str.length()-1));
            return reverseString(str.substring(0,str.length()-1));
        }
    }
}
