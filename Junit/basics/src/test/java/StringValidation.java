import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringValidation {

    static BookingID booking;

    @BeforeClass
    public static void setUp()
    {
        booking=new BookingID();
    }
    @AfterClass
    public static void setUpEnd()
    {
        booking=null;
    }
    @Test
    public void testValidBookingId()
    {


        Assert.assertEquals("Valid bookingID",booking.bookingId("53465654"));

    }
    @Test
    public void testInValidBookingId()
    {
        Assert.assertEquals("Invalid BookingID",booking.bookingId("abcdef"));

    }

}
