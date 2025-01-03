package hotelTable.reservation.client;

import hotelTable.reservation.system.BookingThread;
import hotelTable.reservation.system.Counter;

public class Booking 
{
	public static void main(String args[])
	{
		Counter counter = new Counter();
		BookingThread t1= new BookingThread(counter, "Soumik", 2);
		BookingThread t2= new BookingThread(counter, "Shivam", 2); 
		
		t1.start(); t2.start();
	}

}
