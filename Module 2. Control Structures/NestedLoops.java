import java.util.Scanner;

/*
Write a program to change the case of each character in a string using nested loops
 */
public class NestedLoops
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // Write the logic using nested loop.
        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int ascii = words[i].charAt(j);
                if (ascii > 65 && ascii < 90) {
                    char letter = (char) (ascii + 32);
                    System.out.print(letter);
                }
                else {
                    char letter = (char) (ascii - 32);
                    System.out.print(letter);
                }
            }
            System.out.print(" ");
        }
    }
}
