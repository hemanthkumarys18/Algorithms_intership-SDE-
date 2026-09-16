package Day_19;

public class Methclassmeth 
{

    static void calculateBasic() 
    {

        System.out.println("Basic Salary");
    }

    static void calculateHRA() 
    {

        calculateBasic();
        System.out.println("HRA");
    }

    static void calculateDA() 
    {

        calculateHRA();
        System.out.println("DA");
    }

    static void calculateTax() 
    {

        calculateDA();
        System.out.println("Tax");
    }

    static void calculateSalary() 
    {

        calculateTax();
        System.out.println("Final Salary");
    }

    public static void main(String[] args) 
    {

        calculateSalary();
    }
}