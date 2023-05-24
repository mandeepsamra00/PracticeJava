package session34;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MovieTicket{
public static int ticketNumber;
String movieName;
String seatNumber;
boolean isTicketBooked;
String emailUser;

public MovieTicket(){
}
	
	public MovieTicket(String movieName, String seatNumber, boolean isTicketBooked, String emailUser) {
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.isTicketBooked = isTicketBooked;
		this.emailUser = emailUser;
	}
	
	@Override
	public String toString() {
		return "MovieTicket [movieName= " + movieName+ " , seatNumber= " +seatNumber+ ", "
				+ "isTicketBooked= " +isTicketBooked+ ", emailUser=" +emailUser+ "]";
		
}
	}

class MovieTicketBookingTask implements Callable<String>{
	
	MovieTicket ticket;
	
	public MovieTicketBookingTask(MovieTicket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String call() throws Exception {
		
		
		
		ticket.seatNumber = "A"+MovieTicket.ticketNumber;
		ticket.isTicketBooked = true;
		MovieTicket.ticketNumber++;
		System.out.println("Paying for the ticket saet "+ticket.seatNumber+  " for user: "+ticket.emailUser+"----");
		//Thread.sleep(2000);
		System.out.println("Ticket booked for "+ticket.emailUser);
		System.out.println();
		
		return "Ticket Booked for "+ticket.emailUser+ " with seat number: "+ticket.seatNumber;
	}
}

public class CallableFutureApp {

	public static void main(String[] args) {
		
		System.out.println("Movie Ticket booking App Stared");
		
		MovieTicket ticket1 = new MovieTicket("Avengers", "A1", false, "john@example.com");
		MovieTicket ticket2 = new MovieTicket("Avengers", "A2", false, "jeni@example.com");
		MovieTicket ticket3 = new MovieTicket("Avengers", "A3", false, "jim@example.com");
		MovieTicket ticket4 = new MovieTicket("Avengers", "A4", false, "joack@example.com");
		MovieTicket ticket5 = new MovieTicket("Avengers", "A5", false, "johe@example.com");
		
		System.out.println("ticket1: "+ticket1);
		System.out.println("ticket2: "+ticket1);
		System.out.println("ticket3: "+ticket1);
		System.out.println("ticket4: "+ticket1);
		System.out.println("ticket5: "+ticket1);
		
		System.out.println("Proccessing: "+Runtime.getRuntime().availableProcessors());
		
		Callable task1 = new MovieTicketBookingTask(ticket1);
		Callable task2 = new MovieTicketBookingTask(ticket2);
		Callable task3 = new MovieTicketBookingTask(ticket3);
		Callable task4 = new MovieTicketBookingTask(ticket4);
		Callable task5 = new MovieTicketBookingTask(ticket5);
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<String> future1 = service.submit(task1);
		Future<String> future2 = service.submit(task2);
		Future<String> future3 = service.submit(task3);
		Future<String> future4 = service.submit(task4);
		Future<String> future5 = service.submit(task5);
		
		/*try {

			System.out.println("Task1 Result: "+future1.get());
			System.out.println("Task2 Result: "+future2.get());
			System.out.println("Task3 Result: "+future3.get());
			System.out.println("Task4 Result: "+future4.get());
			System.out.println("Task5 Result: "+future5.get());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}catch(ExecutionException e) {
			e.printStackTrace();
		}*/
		
		System.out.println("Movie Ticket Booking app Finished");

	}

}
