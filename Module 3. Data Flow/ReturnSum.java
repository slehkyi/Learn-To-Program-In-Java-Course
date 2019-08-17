import java.util.*;
/*
    Write a program to print the sum of two numbers which is of type
    double and integer and the sum value should be in float.
    Create 3 Methods with return values as detailed.
 */
public class ReturnSum
{
    public static void main(String args[])
    {
        // write the logic to get the sum
        float sum = thirdMethod();
        System.out.println("And the sum is...... " + sum);
    }

    // firstMethod()
    public static int firstMethod() {
        int x = 5;
        return x;
    }

    // secondMethod()
    public static double secondMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any number: ");
        double d = sc.nextDouble();
        return d;
    }

    // thirdMethod()
    public static float thirdMethod() {
        int x = firstMethod();
        double d = secondMethod();
        float sum = (float) (x + d);
        return sum;
    }
}