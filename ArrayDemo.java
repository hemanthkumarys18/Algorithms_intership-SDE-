package Day_31;

public class ArrayDemo 
{
    public static void main(String[] args)
    {
        MyArray myarray = new MyArray();
        

        // System.out.println("Initial Array");
        // myarray.printElements();


        myarray.insertAtEnd(10);
        myarray.insertAtEnd(20);
        myarray.insertAtEnd(30);
        myarray.insertAtEnd(40);
        myarray.insertAtEnd(50);


       System.out.println("After inserting ");
        myarray.printElements();

        //start

      /*    myarray.insertAtStart( 15);;
        System.out.println("after Insert at Start");
        myarray.printElements();

        //position
        myarray.insertAtPosition(2, 15);
        System.out.println("after insert at position ");
        myarray.printElements();

        //array is full 
        myarray.insertAtEnd(30);
        myarray.insertAtPosition(2, 10);;
        myarray.insertAtStart( 18);;
*/


//===========Deletion========================

myarray.deleteFromEnd();
System.out.println("Agter deleting from end");
myarray.printElements();


myarray.deleteFromStart();
System.out.println("after delete from start");
myarray.printElements();


myarray.deleteFromAnyPositon(2);
System.out.println("after delete  from position 2");
myarray.printElements();




    }
    
}
