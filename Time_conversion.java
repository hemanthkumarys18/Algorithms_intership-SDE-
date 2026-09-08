
// Seconds to hours conversion 
import java.util.Scanner;
public class Time_conversion 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int seconds = sc.nextInt();

        double hours = seconds / 3600.0;

        System.out.println("Hours = " + hours);
    }
}