public class Cinema 
{
    public static void main(String[] args)
    {
        int total_audience = 125;
        int seats_row = 12;

        System.out.println("total_audience :" +total_audience);
        System.out.println("seats_row :"  +seats_row);

        int complete_rows = total_audience / seats_row;
        int remaining_seats = total_audience % seats_row;

        System.out.println("complete_rows :" +complete_rows);
        System.out.println("remaining_seats :"  +remaining_seats);

    }
    
}
