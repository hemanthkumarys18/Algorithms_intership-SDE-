package Day_19;

public class PassbyObject 
{
    static void update(int b[])//10,20,30,40
    {
        b[0] = 100;//100,20,30,40
        System.out.println("inside update: " +b[0]);
    }




    public static void main(String[] args)
    {
        int a[] = {10,20,30,40};
        System.out.println("before method call:" +a[0]);//10

        update(a);

        System.out.println("After call method: " +a[0]);//100
    }
    
}
