package Day_23;

public class String_names 
{
    static void Names(String...names)
    {
        for(String n: names)
    {
        System.out.println(n);
    }
    
    }
    public static void main(String[] args)
    {
        Names("darshan","hemanth","vaibhav","anil","kushal");
    }
}
