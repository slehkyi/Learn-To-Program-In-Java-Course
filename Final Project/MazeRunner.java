import java.util.Scanner;
/*
    Final project for the course - "MazeRunner", a program that navigates through a given maze.
    The code for the Maze is already written, and provided in "Maze.java".
    You just need to write the code that uses Maze and decides how to move through it.
 */

public class MazeRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maze myMap = new Maze();
        intro();
        myMap.printMap();
        boolean win = myMap.didIWin();
        int countMoves = 0;
        while (!win) {
            moveMessages(countMoves);
            if (countMoves >= 100) {
                System.out.println("Sorry, but you didn't escape in time - you lose!");
                break;
            }
            makeMove(sc, myMap);
            countMoves++;
            win = myMap.didIWin();
        }
        if (countMoves < 100) {
            System.out.println("Congrats, you survived and you did it in " + countMoves + " moves");
        }
    }

    public static void intro() {
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current position: ");
    }

    public static String userMove(Scanner sc) {
        System.out.println("Where would you like to move? (R)ight, (L)eft, (U)p or (D)own?");
        String move = "";
        String userPick = sc.next();
        while (move.length() == 0) {
            if (userPick.equalsIgnoreCase("r")) {
                move = "R";
            } else if (userPick.equalsIgnoreCase("l")) {
                move = "L";
            } else if (userPick.equalsIgnoreCase("u")) {
                move = "U";
            } else if (userPick.equalsIgnoreCase("d")) {
                move = "D";
            } else {
                System.out.print("Please, try again");
                userPick = sc.next();
            }
        }
        return move;
    }

    public static void makeMove(Scanner sc, Maze map) {
        String move = userMove(sc);
        if (map.isThereAPit(move)) {
            navigatePit(move, sc, map);
        } else {
            if (move.equals("R") & map.canIMoveRight()) {
                map.moveRight();
                map.printMap();
            } else if (move.equals("L") & map.canIMoveLeft()) {
                map.moveLeft();
                map.printMap();
            } else if (move.equals("U") & map.canIMoveUp()) {
                map.moveUp();
                map.printMap();
            } else if (move.equals("D") & map.canIMoveDown()) {
                map.moveDown();
                map.printMap();
            } else {
                System.out.println("Sorry, you've hit the wall");
                System.out.println("--------------------------");
                map.printMap();
            }
        }
    }

    public static void moveMessages(int countMoves) {
        if (countMoves == 50) {
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
        } else if (countMoves == 75) {
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        } else if (countMoves == 90) {
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        } else if (countMoves == 100) {
            System.out.println("Oh no! You took too long to escape, and now you are dead of hunger! Your bones will remain in the maze FOREVER!!!");
        }
    }

    public static void navigatePit(String dir, Scanner sc, Maze map) {
        System.out.println("Wath out! There is a pit on your way! Jump over it? (Y)es (N)o");
        String decision = sc.next();
        boolean decisionMade = false;
        while (!decisionMade) {
            if (decision.toLowerCase().startsWith("y")) {
                System.out.println("You made it through!");
                map.jumpOverPit(dir);
                map.printMap();
                decisionMade = true;
            } else if (decision.toLowerCase().startsWith("n")) {
                System.out.println("You remain at the same point and you just lost a move");
                map.printMap();
                decisionMade = true;
            } else {
                System.out.println("Please, enter correct value");
                decision = sc.next();
            }
        }
    }
}
