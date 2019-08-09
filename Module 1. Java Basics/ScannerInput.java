import java.util.*;
public class ScannerInput
{
    public static void main(String args[])
    {
        Scanner getMessage = new Scanner(System.in);
        System.out.println("Enter few words: ");
        String message = getMessage.nextLine();
        System.out.println(message);
    }
}
