package Day_17;

public class Ways_of_methods 
{
    //`1. no aruguments no return
    static void greet(){
        System.out.println("hi");
    }

    //2.args but not return
    static void printSum(int a, int b){
        System.out.println(a+b);

    }

    //3. no args but return
    static int getNumber()
    {
        return 100;
    }

    //4. args and returns
    static int max(int x, int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    


public static void main(String[] args)
{
    //1
    greet();
    //2
    printSum(30,40);
    //3
    int num = getNumber();
    System.out.println(num);

    //4
    int largest = max(45,15);
    System.out.println(largest);

} 

}

