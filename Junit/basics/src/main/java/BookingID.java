import java.util.Scanner;

public class BookingID {
    /*public static void main(String[] args) {
        new BookingID().bookingId();
    }*/
    public String bookingId(String str) {
            //Scanner scan = new Scanner(System.in);
           // String str = scan.next();
            // int bookingId=Integer.parseInt(str);

        if (str.matches("[0-9]*")) {
            //System.out.println("Valid");
            return "Valid bookingID";
        } else {
            return "Invalid BookingID";
        }


        }


}
