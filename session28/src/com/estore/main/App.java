package com.estore.main;

import com.estore.app.One;
//import com.estore.app.Two;

class Child extends One{
	
	void show() {
		//pvtShow();//error
		//defShow(); //error
		proShow();//ok
		pubShow();//ok
	}
}

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		//oRef.pvtShow(); //error
		//oRef.defShow();//error
		//oRef.proShow();//error Hence, protected and default are visible as of now only within the same package
		//oRef.pubShow();//ok
		
		Child ch = new Child();
		ch.show();
	}

}
