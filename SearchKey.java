package Day_34;

import java.util.Scanner;

public class SearchKey {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");


        for (int i = 0; i < size; i++) 
        {            

            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        for (int i = 0; i < size; i++) 
        {

            if (arr[i] == key) {
                System.out.println("Key found at index " + i);
            }
        }

        sc.close();
    }
}