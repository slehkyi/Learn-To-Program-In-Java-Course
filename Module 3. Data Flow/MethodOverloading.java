import java.util.*;

/*
    Write a program to concatenate two strings using method overloading.
 */
public class MethodOverloading
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = "Hello";// First String
        String s2 = sc.next(); // Second String
        // Call the Method2();
        method2(s1, s2);
    }

    public static void method2(String str) {
        System.out.println(str);
    }

    public static void method2(String str1, String str2) {
        String finalString = str1 + str2;
        method2(finalString);
    }
}
