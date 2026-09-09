package Day_17;

public class Oneobject 
{

    
    //`1. no aruguments no return
     void greet(){
        System.out.println("hi");
    }

    //2.args but not return
     void printSum(int a, int b){
        System.out.println(a+b);

    }

    //3. no args but return
     int getNumber()
    {
        return 100;
    }

    //4. args and returns
     int max(int x, int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    


public static void main(String[] args)
{
    //1
   Objectfor obj1 = new Objectfor();
   obj1.greet();

   
   obj1.printSum(40,60);

    
    int num = obj1.getNumber();
    System.out.println(num);

    int largest = obj1.max(10,20);
    System.out.println(largest);
    
}
}