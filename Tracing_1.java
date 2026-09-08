public class Tracing_1 
{
    public static void main(String[] args) {

        int number = 5;
        int sum = 0;
        double average;
        boolean result = true;
        char grade = 'A';

        for (int i = 1; i <= number; i++) {

            sum = sum + i;

            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
        }

        average = (double) sum / number;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Grade = " + grade);
        System.out.println("Result = " + result);
    }
}
    

