public class ExtractsDigit 
{
    public static void main(String[] args)
    {
        int number = 786;
        System.out.println("number :" + number);

        int lastDigit = number % 10; //this are all formulas
        int middleDigit = (number / 10) % 10; 
        int firstDigit = number / 100; 


        System.out.println("First digit: " + firstDigit); 
        System.out.println("Middle digit: " + middleDigit); 
        System.out.println("Last digit: " + lastDigit);
    }
    
    
}
