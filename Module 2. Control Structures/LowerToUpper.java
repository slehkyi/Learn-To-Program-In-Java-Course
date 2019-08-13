import java.util.*;
/*
    Given an input string containing only alphabet characters, write a program to reverse the case of each letter.
    Convert lower case letters to upper case, and upper-case letters to lower case.
    Conversions must be accomplished without using string methods.
    Use ASCII values of Alphabet Characters from A to Z (65 to 90) a to z (97 to 122). Print the converted string.
 */
public class LowerToUpper
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.next(); // String value
        String reversedWord = "";
        // Write the logic to convert upper case to lower case and lower to upper
        for (int i = 0; i < word.length(); i++) {
            int ascii = word.charAt(i);
            if (ascii > 65 && ascii < 90) {
                char letter = (char) (ascii + 32);
                System.out.print(letter);
            }
            else {
                char letter = (char) (ascii - 32);
                System.out.print(letter);
            }
        }

    }
}