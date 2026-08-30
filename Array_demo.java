import java.util.Arrays;

public class Array_demo 
{
    public static void main(String[] args)
    {
        //int arr[5];  wrong

        int arr[] = new int[9];
        System.out.println(arr);  //hash value 
        System.out.println(Arrays.toString(arr)); //default value


        int arr1[] = {10, 20, 30, 40};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));



        int arr2[] = new int[5];
        System.out.println(arr2);  //hash value 
        System.out.println(Arrays.toString(arr2));
        
    }
    
}
