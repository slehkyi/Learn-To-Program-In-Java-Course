import java.util.Scanner;

public class InputBirthday {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("On what day of the month were you born?");
        int day = userInput.nextInt();
        System.out.println("What is the name of the month in which you were born?");
        String month = userInput.next();
        System.out.println("During what year were you born?");
        int year = userInput.nextInt();
        System.out.println("You were born on " + month + " " + day + ", " + year + ". You are young as fuck!");
    }
}
