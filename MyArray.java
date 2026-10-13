package Day_31;

public class MyArray 
{
    int [] array;//place to store yhe element
    int length;//total sizeof the array
    int rightIndex;//point at the empty  box

    public MyArray()
    {
        length = 5;
        array = new int[length];//[0][0][0][0][0] --> initial array
        rightIndex = 0;
    }
    //insert at end 

    public void insertAtEnd(int value)
    {
        if (rightIndex == length)
        {
            System.out.println("Array is full");
            return;
        }
        else
        {
            array[rightIndex] = value;
            rightIndex++;//after inserting at the end size go increased
        }
    }
    //insert at the start
    public void insertAtStart(int value)
    {
        if (rightIndex == length)
        {
            System.out.println("Array is full");
            return;
        }
        else
        {
            // shift element  one position to right
            for(int i = rightIndex-1; i >= 0; i--)
            {
                 array[i+1] = array[i]; 
            }
        }
        //insert
         array[0] = value;
         rightIndex++;
    }

    //insert any position 
    public void insertAtPosition(int position,int value)
    {
        if (rightIndex == length)
        {
            System.out.println("Array is full");
            return;
        }
        if (position < 0 || position > rightIndex)
        {
            System.out.println("Invlid position ");
            return;
        }
        // shift and insert
        for (int i = rightIndex-1; i >= position; i--)
        {
            array[i+1] = array[i];
        }
        array[position] = value;
        rightIndex++;
    }

    // ============Deletion==============

    //Delete at end 

    public void deleteFromEnd()
    {
        if(rightIndex == 0)
        {
            System.out.println("Array is empty:");
            return;
        }
        else
        {
            array[rightIndex -1] = 0;
            rightIndex--;

        }
    }

    //Delete at start

    public void deleteFromStart()
    {
        if(rightIndex == 0)
        {
            System.out.println("array is empty:");
            return;
        }

        //shift element from index = 0(from start)

        for(int i = 0; i < rightIndex; i++)
        {
            array[i] = array[i+1];
        }
        rightIndex--;//we reducing size(rightIndex) bcoz delete 1 elemnt out of 5
        array[rightIndex] = 0;
    }

    //delete from any position
    public  void deleteFromAnyPositon(int position)
    {
        if(rightIndex == 0)
        {
            System.out.println("empty array:");
            return;
        }
        if(position < 0 || position >= rightIndex)
        {
            System.out.println("Invalid position:");
            return;
        }
        for(int i = position; i < rightIndex; i++)
        {
            array[i] = array[i+1];
        }
        rightIndex--;
        array[rightIndex] = 0;
    }
     





    //print elements
    public void printElements()
    {
        System.out.println("index\tvalue");
        for (int i = 0; i < length; i++)
        {
            System.out.println(i+"\t"+array[i]);
        }
        System.out.println();
        System.out.println("size :" +rightIndex);
    }
}
