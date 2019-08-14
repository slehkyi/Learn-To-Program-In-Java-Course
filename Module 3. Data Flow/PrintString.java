import java.util.*;
/*
Write a method called printStrings that accepts a String and a number of repetitions as parameters
and prints that String the given number of times.
 */
public class PrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = sc.nextLine();
        System.out.print("Give the number of repetitions: ");
        int reps = sc.nextInt();
        printString(str, reps);
    }

    private static void printString(String str, int reps) {
        while (reps > 0) {
            System.out.print(str);
            reps--;
        }
    }
}
