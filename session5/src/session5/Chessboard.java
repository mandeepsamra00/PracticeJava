package session5;

public class Chessboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	ChessBoard
		 *  B W B W
		 *  W B W B 
		 *  B W B W
		 *  W B W B
		 *  ChessBoard
		 *  1 0 1 0
		 *  0 1 0 1
		 *  1 0 1 0
		 *  0 1 0 1
		 * */
		
		char ch1 = 'B';
		char ch2 = 'W';
		
		char black = '\u25A0';
		char white = '\u25A1';
		
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=8;j++) {
				if(i%2==0) {
					//System.out.println((j+1)%2+" ");
					//try some ternanry operator approach usage and show the chessboard as B W ...
					char result = (j+1)%2 == 0 ? white: black;
					System.out.println(result+" ");
				}else {
					//System.out.println(j%2+" ");
					char result = j%2 == 0 ? white : black;
					System.out.println(result+" ");
				}
				
			}
			System.out.println();
			
			//Open the browser, type Unicode White square.
			/*Come back and write, a character called black is \u25A0, and in the same way, you 
      got a character called white which is \u25A1. Now you have two characters instead 
      of B and W, you got the real black and white, this is how you can work with the ternary 
      operator usage.
*/
		}
	}

}
