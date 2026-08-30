public class Static_Demo
{
    static void a()
    {
        b();
    }
    static void b()
    {
        c();
    }
    static void c()
    {
        System.out.println("Hello Hemanth ,have good day");

    }

    public static void main(String[] args)
    {
        a();
    }
    
}
