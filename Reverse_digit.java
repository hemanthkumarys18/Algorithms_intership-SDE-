
import java.util.Scanner;

public class Reverse_digit 
{
    public static void main(String[] args) 
    {

        int number = 527;

        System.out.println("Original number: " + number);

        int reverse = 0;

        reverse = reverse * 10 + number % 10;
        number = number / 10;

        reverse = reverse * 10 + number % 10;
        number = number / 10;

        reverse = reverse * 10 + number % 10;

        System.out.println("Reverse number: " + reverse);
    }
    
}
