
public class Incree_decree 
{
    public static void main(String[] args)
    {
        int count = 10;
        System.out.println(count++);//10
        System.out.println(count);//11
        System.out.println(count++);//11
        System.out.println(count);//12

        System.out.println("-------decreement-------");

        System.out.println(count--);//12
        System.out.println(count);//11
        System.out.println(count--);//11
        System.out.println(count);//10


         System.out.println("-------preee-------");
         System.out.println(--count);
         System.out.println(count);
         System.out.println(--count);
         System.out.println(count);

         System.out.println("-------store-------");

         int store = count;
         store++;
         System.out.println(store);


         System.out.println("-------store2-------");

         int store_2 = count;
         store--;
         System.out.println(store);

         System.out.println("--------------");
         int count1 = 12;
         int count2 = count1++;

         System.out.println(count1);
         System.out.println(count2);

         System.out.println("-------behaviour-------");
         int c = 10;
         System.out.println(c++ + 5);
         System.out.println(c);
         System.out.println(++c + 5);
         System.out.println(c);

        System.out.println("-------confusing behaviour-------");
        int num = 10;
        System.out.println(num++ + ++num);//22

         System.out.println("--------------");
        int num1 = 11;
        System.out.println(num1++ + num1++);//23

        System.out.println("--------------");
        int num2 = 12;
        System.out.println(num2++ - ++num2);//-2

         System.out.println("--------------");
        int num3 = 20;
        System.out.println(++num3 + --num3);//41

        System.out.println("--------------");
        int a = 5 ,b = 10;
        System.out.println(a++ + ++b);//16
        System.out.println(a);//6
        System.out.println(b);//11

        System.out.println("--------------");
        int z = 4; 
        System.out.println(++z + z++);//5+5=10
        System.out.println(z);//above z++ 5,6 is there the consider 6 o/p=6
        















    }
    
}
