import java.util.*;

/*
    Write a program that multiples input by 3 using two methods.
    method1() to have a number parameter that is a Double and calls method2() with the number cast to an int.
    method2 to have a number parameter that is an int and prints the product of the number multiplied by 3.
 */
public class MeetParameters
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Double  num1 = sc.nextDouble();

        // Call the Method1() using the Scanner input
        method1(num1);
    }
    // Method1() contains one parameter which is of type double
    public static void method1(double num) {
        int numInt = (int) num;
        method2(numInt);
    }
    // Method 2() contains one parameter which is of type int
    public static void method2(int num) {
        System.out.println("The result: " + num*3);
    }
}
