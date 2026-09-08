public class Fact {
    public static void main(String[] args) {

        int fact = 1;

        for (int i = 1; i <= 9; i++) 
        {
            fact = fact * i;
        }

        System.out.println("Factorial of 9 = " + fact);
    }
}