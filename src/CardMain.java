
import java.util.Scanner;

public class CardMain {
	public static void main(String[] args) {
		
		Deck game = new Deck();
		//SHUFFLE THE DECK OF CARDS
		System.out.println("\n Shuffling your cards \n");
		game.myShuffle();  //without using Collections
		System.out.println("\n Shuffling your cards \n");
		game.shuffle();    //using Collections
		boolean flag=true;
		Scanner reader = new Scanner(System.in);
		//Loop till all cards are dealt of user decides to exit
		while(flag){
		System.out.println("Enter 0 to exit the game or Enter 1 to deal a card  or Enter 2 to shuffle \n"
				+ "Enter a number: ");
		int sel = reader.nextInt();
		
		switch(sel) {
		case 0:
				System.out.println("\n You will exit \n");
				flag=false;
				break;
		case 1:
				
				Object x = game.dealOneCard();
				if (x instanceof Card) {
					System.out.println(((Card) x).suit+" of "+((Card) x).faceValue+"\n");
					break;
				} 
				else {
					System.out.println("\n All cards have been dealt!! \n");
					flag=false;
					break;
				} 
		case 2:
			System.out.println("\n Shuffling your cards \n");
			game.shuffle();
		}
		
		}
      reader.close();
	}
}
