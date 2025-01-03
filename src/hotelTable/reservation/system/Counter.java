package hotelTable.reservation.system;

public class Counter 
{
	private int availableSeats=3;
	
	public synchronized void bookTicket(String name, int seats)
	{
		if((availableSeats>seats) && (seats>0))
		{
			System.out.println("Hey, "+name+" : "+seats+" seats  have been booked.");
			availableSeats-=seats;
		}
		else
		{
			System.out.println("Hey, "+name+" : "+" Seats not available. ");
		}
	}

}
