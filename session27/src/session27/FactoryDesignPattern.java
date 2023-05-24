package session27;

import java.util.Date;

interface Plan{
	
	String getPlanName();
	int getPlanPrice();
	
	default void purchase(int amount) {
		if(amount == getPlanPrice()) {
			System.out.println("Purchasing the plan: "+getPlanName());
			System.out.println("Plan Purchased Successfully for an amount value: "+amount);
			onPurchase("Plan Activated form "+new Date());
		}else {
			System.out.println("Plan Purchase Failed. Amount Mismatched");
		}
	}
	
	void onPurchase(String message);
	}

class Plan3G implements Plan{

	@Override
	public String getPlanName() {
		
		return "Unlimited Plan3G";
	}

	@Override
	public int getPlanPrice() {
		
		return 250;
	}

	@Override
	public void onPurchase(String message) {
		System.out.println("[Message] "+message);
		
	}
	
}

class Plan4G implements Plan{

	@Override
	public String getPlanName() {
		
		return "Unlimited Plan3G";
	}

	@Override
	public int getPlanPrice() {
		
		return 470;
	}

	@Override
	public void onPurchase(String message) {
		System.out.println("[Message] "+message);
		
	}
	
}
 //Design pattern - Factory Design pattern

class PlanFactory{
	
	public static Plan getPlan(int typeOfPlan) {
		Plan plan = null;
		
		if(typeOfPlan == 3) {
			plan = new Plan3G();
		}else if(typeOfPlan == 4) {
			plan = new Plan4G();
		}else if(typeOfPlan == 5) {
			plan = new Plan5G();
		}else {
			System.out.println("Invalid Type of Plan");
		}
		
		return plan;
	}
}

class Plan5G implements Plan{

	@Override
	public String getPlanName() {
		
		return "Nolimits Plan5G";
	}

	@Override
	public int getPlanPrice() {
		
		return 800;
	}

	@Override
	public void onPurchase(String message) {
		System.out.println("[Message] "+message);
		
	}
	
}

public class FactoryDesignPattern {

	public static void main(String[] args) {
		
		Plan plan = PlanFactory.getPlan(7); //change here number 4, 5 also
		if(plan != null) {
		plan.purchase(800); //change here number 250, 470, 800 also
		}
	}

}
