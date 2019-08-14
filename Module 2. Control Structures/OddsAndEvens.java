import java.util.*;

/*
    For this project you are going to program a game called "Odds and Evens".
 */

public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Part 1. Intro
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.print("What is your name?");
        String name = sc.next();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
        String userPick = sc.next();
        String userSide = "";
        String computerSide = "";
        while (userSide.length() == 0) {
            if (userPick.equalsIgnoreCase("o")) {
                userSide = "Odds";
                computerSide = "Evens";
            } else if (userPick.equalsIgnoreCase("e")) {
                userSide = "Evens";
                computerSide = "Odds";
            } else {
                System.out.print("Please, try again");
                userPick = sc.next();
            }
        }
        System.out.println("Cool! " + name + " has picked " + userSide + "! Computer will play " + computerSide + ".");
        separator();

        // Part 2. Get players' moves
        System.out.print("How many \"fingers\" do you put out?");
        int userFingers = sc.nextInt();
        Random rand = new Random();
        int computerFingers = rand.nextInt(6);
        System.out.println("Computer played " + computerFingers + " \"fingers\"");
        separator();

        // Part 3. Find a winner
        int sum = userFingers + computerFingers;
        System.out.println(userFingers + " + " + computerFingers + " = " + sum);
        boolean oddOrEven = sum % 2 == 0;
        if ((userSide.equals("Odds") && !oddOrEven) || (userSide.equals("Evens") && oddOrEven)) {
            System.out.println(name + " wins! Congrats!");
        } else {
            System.out.println("Computer destroyed you! HAHAHAHAHA!");
        }
        separator();
    }

    private static void separator() {
        System.out.println("-------------------------------------");
    }
}
