package session27;

import java.util.Calendar;
import java.util.Date;

/*
 	order has State
 	States - > placed, shipped and delivered
 */

interface State{
	String getStateName();
	Date getDateTimeStamp();
	Date getDateTimeStamp(Date date);
	void updateDateTimeStamp(Date date);
}

class Placed implements State{
	
	Date dateTimeStamp;

	@Override
	public String getStateName() {
	
		return "PLACED";
	}

	@Override
	public Date getDateTimeStamp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getDateTimeStamp(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDateTimeStamp(Date date) {
		// TODO Auto-generated method stub
		
	}
	
}

class Shipped implements State{
	
	Date dateTimeStamp;

	@Override
	public String getStateName() {
		return "SHIPPED";
	}

	@Override
	public Date getDateTimeStamp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getDateTimeStamp(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDateTimeStamp(Date date) {
		// TODO Auto-generated method stub
		
	}

	
}

class Delivered implements State{
	
	Date dateTimeStamp;

	@Override
	public String getStateName() {
		return "DELIVERED";
	}
	
	@Override
	public void updateDateTimeStamp(Date date) {
		dateTimeStamp = date;
	}

	@Override
	public Date getDateTimeStamp() {
		
		return dateTimeStamp;
	}

	@Override
	public Date getDateTimeStamp(Date date) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

class Order{
	
	State state; // Has-A Relationship
	
	Order(){
		state = new Placed();
		state.updateDateTimeStamp(new Date());
	}
	
	State getState() {
		return state;
	}
	
	void updateState(State newState) {
		state = newState;
	}
}

public class StateDesignPattern {

	public static void main(String[] args) {
		
		Order order = new Order();
		System.out.println("State of order as of now is: "+order.getState().getStateName());
		System.out.println("TimeStamp for the current state is: "+order.getState().getDateTimeStamp());
		
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		State state;
		state = new Shipped();
		state.updateDateTimeStamp(new Date());
		
		order.updateState(state);
		
		System.out.println("State of order as of now is: "+order.getState().getStateName());
		System.out.println("TimeStamp for the current state is: "+order.getState().getDateTimeStamp());
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 30);
		
		Date date = calendar.getTime();
		
		System.out.println();
		
		state = new Delivered();
		state.updateDateTimeStamp(date);
		order.updateState(state);
		System.out.println("State of order as of now is: "+order.getState().getStateName());
		System.out.println("TimeStamp for the current state is: "+order.getState().getDateTimeStamp());
		
	}

}
