package session32;

/*class PrintingTask{
	
	void printPages() {

		for(int i=1; i<=10; i++) {
			System.out.println("[PrintingTask] Printing book pages for LearningJava.pdf: Pages "+i);
		
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}*/

class CA{
	
}

//class PrintingTask extends Thread{ ///now, Printing is a Thread
//class PrintingTask extends CA, Thread{ // error as multiple extension not supported

class PrintingTask extends CA implements Runnable{ //Now, printingTask is a thread
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("[PrintingTask] Printing book pages for LearningJava.pdf: pages "+i);
		
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadingApp {

	public static void main(String[] args) {
		System.out.println("[main] Thread Started");
		
		//PrintingTask task = new PrintingTask();
		//task.printPages();
		//task.start();
		
		Runnable ref = new PrintingTask(); //Polymorphic Statement
		Thread th = new Thread(ref);
		
		th.setName("PrintlnTask");
		th.setPriority(Thread.MAX_PRIORITY); //10 | MIN -> | NORM -> 5
		
		System.out.println("1 - State of th is :" +th.getState());
		
			/*try {
				th.join();
			}catch(InterruptedException e1) {
				e1.printStackTrace();
			}
			*/
			th.start();
			
			for(int i=1; i<=10; i++) {
				System.out.println("[main] Printing book pages for LearningJava.pdf: pages "+i);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			
		}
		
		System.out.println("th name is: "+th.getName()+ " priority is :"+th.getPriority());
		System.out.println("main thread is : "+Thread.currentThread().getName()+" and priority is :"+Thread.currentThread().getPriority());
		
		
		System.out.println("2. State of th is: "+th.getState());
		System.out.println("Main thread finished");

	}

}
