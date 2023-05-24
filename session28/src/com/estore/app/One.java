package com.estore.app;

//public class 
public class One {
	
	private int a;
	int b;
	protected int c;
	public int d;
	
	private void pvtShow() {
		System.out.println("[One] This is private show");
	}
	
	void defShow() {
		System.out.println("[One] this is Deafult show");
	}
	protected void proShow() {
		System.out.println("[One] this is protected show");
	}
	public void pubShow() {
		System.out.println("[One] this is public show");
	}
}

//default class or package level class
 class Two{
	
	 private void pvtShow() {
			System.out.println("[Two] This is private show");
		}
		
		void defShow() {
			System.out.println("[Two] this is Deafult show");
		}
		protected void proShow() {
			System.out.println("[Two] this is protected show");
		}
		public void pubShow() {
			System.out.println("[Two] this is public show");
		}
}
 //In your web browser, search Google Draw in the search bar and open it.
 
