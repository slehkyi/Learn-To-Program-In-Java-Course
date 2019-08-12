import java.util.Scanner;
public class LeapYear
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        boolean flag = false;
        if (num % 5 == 0) {
            flag = true;
        }

        System.out.println(flag);
    }
}
