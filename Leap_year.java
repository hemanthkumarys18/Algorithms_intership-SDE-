import java.util.*;
public class Leap_year 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        

        if(year % 2 == 0)
        {
            System.out.println("this year is leap year: ");
        }
        else
        {
            System.out.println("this is not a leap year: ");

        }
    }
    
}
