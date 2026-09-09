package Day_17;

public class Objectfor 
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

   Objectfor obj2 = new Objectfor();
   obj2.printSum(40,60);

    Objectfor obj3 = new Objectfor();
    int num = obj3.getNumber();
    System.out.println(num);

    Objectfor obj4 = new Objectfor();
     int largest = obj4.max(10,20);
     System.out.println(largest);






} 
}
