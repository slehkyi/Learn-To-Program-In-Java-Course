import java.util.*;

/*
Write a program to determine if the given character (‘v’) is found in an input string.
Use a while loop to test each letter in the input.
If the test character is found in the input String print “Found” otherwise print “Not Found”.
 */
public class FindCharacter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char test = 'v';// Character input
        // Write the logic to find the given character is found in the given string using a while loop
        while (input.indexOf(test) >= 0) {
            System.out.println("Found");
            input = sc.next();
        }
        System.out.println("Not found, exiting the program");
    }
}