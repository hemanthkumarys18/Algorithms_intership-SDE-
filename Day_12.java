public class Day_12 
{
    public static void main(String[] args)
    {
        System.out.println(" Scenario 1: both strings Literals");

        String s1 = "java";
        String s2 = "java";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));



        System.out.println(" Scenario 2: both using new");

        String s3 = new String("java");
        String s4 = new String("java");

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));


        System.out.println(" Scenario 3: Literals vs new");

        String s5 = "java";
        String s6 = new String("java");

        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));



        

        
        
    }

    }
    

