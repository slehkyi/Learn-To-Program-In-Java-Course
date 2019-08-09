import java.util.Scanner;

public class VacationPlanner {
    public static void main(String[] args) {
        intro();
        separator();
        budget();
        separator();
        time();
        separator();
        area();
        separator();
    }
    
    public static void separator() {
        System.out.println("******************");
    }

    public static void intro() {
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name?");
        String name = scanInput.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to?");
        String destination = scanInput.nextLine();
        System.out.println("Great! " + destination + " sounds like an awesome trip!");
    }
    
    public static void budget() {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling?");
        int daysTravelling = scanInput.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        int budget = scanInput.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination?");
        String currencySymbol = scanInput.next();
        System.out.print("How many " + currencySymbol + " are there in 1 USD?");
        double conversionRate = scanInput.nextDouble();

        int hoursTravelling = daysTravelling * 24;
        int minutesTravelling = hoursTravelling * 60;
        System.out.println("If you are travelling for " + daysTravelling + " days that is the same as " + hoursTravelling + " hours or " + minutesTravelling + " minutes");

        int spendPerDayUsdInt = (int) (((double) budget / daysTravelling) * 100.0);
        double spendPerDayUsdFormat = spendPerDayUsdInt / 100.0;
        System.out.println("If you are going to spend $" + budget + " USD that means per day you can spend up to $" + spendPerDayUsdFormat + " USD");

        int budgetCurrencyInt = (int) ((budget * conversionRate) * 100.0);
        double budgetCurrencyFormat = budgetCurrencyInt / 100.0;
        int spendPerDayCurrencyInt = (int) ((budgetCurrencyFormat / daysTravelling) * 100.0);
        double spendPerDayCurrencyFormat = spendPerDayCurrencyInt / 100.0;
        System.out.println("Your total budget in " + currencySymbol + " is " + budgetCurrencyFormat + " " + currencySymbol + ", which per day is " + spendPerDayCurrencyFormat + " " + currencySymbol);
    }
    
    /*
    Assuming all time zones have integer values for time differences (ignoring Iran, India, part of Australia etc. with :30 time zone)
    TODO: add possibility to process above cases too
     */
    public static void time() {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination?");
        int hourDifference = scanInput.nextInt();
        int midnight = 24;
        int noon = 12;
        int midnightDifference = (midnight + hourDifference) % 24;
        int noonDifference = (noon + hourDifference) % 24;
        System.out.println("That means that when it is midnight at home it will be " + midnightDifference +
                            ":00 in your travel destination and when it's noon at home it will be " + noonDifference + ":00");
    }
    
    public static void area() {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2?");
        int areaKm = scanInput.nextInt();
        int areaMile = (int) ((areaKm / 2.59) * 100.0);
        double areaMileFormat = areaMile / 100.0;
        System.out.println("In miles2 that is " + areaMileFormat);
    }
}
