package com.estore.app;

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		//oRef.pvtShow(); //error
		oRef.defShow();//ok
		oRef.proShow();//ok
		oRef.pubShow();//ok
		
		System.out.println();
		
		Two tRef = new Two();
		//tRef.pvtShow(); //error
				tRef.defShow();//ok
				tRef.proShow();//ok
				tRef.pubShow();//ok
	}

}
//private: which cannot be accessed outside the class
//default is accessible only within the same package and not outside the package