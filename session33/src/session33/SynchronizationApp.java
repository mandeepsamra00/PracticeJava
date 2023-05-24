package session33;

class Printer{
	
	String status = "Available";
	
	//synchronized void printDocument(String docName, int copies){
		void printerDocument(String docName, int copies) {
		status = "Busy";
		
		System.out.println("[Printer] printing the document: "+docName);
		showPrinterStatus();
		
		for(int i=1; i<=copies;i++) {
			System.out.println("[Println] "+docName+" copy #" +i+ " ....");
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		status = "Available";
		showPrinterStatus();
	
	}
	void showPrinterStatus() {
		System.out.println("[Printer] Status: "+status+"\n");
	}
	
}


class Laptop extends Thread{
	
	Printer pRef;
	
	void attachPrinter(Printer p) {
		pRef = p;
	}
	
	@Override
	public void run() {
		synchronized (pRef) {
			
			try {
				pRef.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		pRef.printerDocument(">> johns resume.pdf <<" , 10);
	}
}
}

class Desktop extends Thread{
	
	Printer pRef;
	
	void attachPrinter(Printer p) {
		pRef = p;
	}
	
	@Override
	public void run() {
		synchronized (pRef) {
		pRef.printerDocument("^^^ Harrys resume.pdf ^^^" , 10);
		pRef.notify();
	}
}
}

public class SynchronizationApp {

	public static void main(String[] args) {
		
		Printer printer = new Printer();//we have created only a single printer object

		/*printer.showPrinterStatus();
		printer.printDocument("LearningJava.pdf", 10);
		printer.showPrinterStatus();*/
		
		Laptop laptop = new Laptop();
		Desktop desktop = new Desktop();
		
		
		laptop.attachPrinter(printer);
		desktop.attachPrinter(printer);
		
		laptop.start();
		desktop.start();
	}

}


