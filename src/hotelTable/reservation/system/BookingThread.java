package hotelTable.reservation.system;

public class BookingThread extends Thread
{
	
	private Counter counter;
	private String custName;
	private int seatsReq;
	
	public BookingThread(Counter c, String name, int seatsReq)
	{
		this.counter=c;
		this.custName=name;
		this.seatsReq=seatsReq;
	}
	
	
	public void run()
	{
		counter.bookTicket(custName, seatsReq);
	}

}
