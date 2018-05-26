import java.util.ArrayList;
import java.util.Collections;
// 
public class Deck {
	ArrayList<Card> myDeck = new ArrayList<Card>();
	// CONSTRUCTOR TO PERMUTE AND CREATE A DECK WITH ALL POSSIBLE VALUES OF SUIT AND FACEVALUES
	public Deck() {
		for(Suit s: Suit.values())
            for(FaceValue f: FaceValue.values())
            {                       
               myDeck.add(new Card(s,f));
            }  		
	}
	
	// SHUFFLE THE DECK CREATED USING COLLECTIONS
	public void shuffle() {
		Collections.shuffle(myDeck);
	}
	
	// SHUFFLE THE DECK CREATED WITHOUT USING COLLECTIONS
	public void myShuffle() {
		int n = myDeck.size();
	    for (int i = 0; i < n; i++) {
	      int change = i + (int) (Math.random() * (n-i));
	      Card helper = myDeck.get(i);
	      myDeck.set(i, myDeck.get(change));
	      myDeck.set(change, helper);
	    }
	    //System.out.println(myDeck.size());
	}
	
	// TO DEAL A SINGLE CARD, IF ALL CARDS ARE DEALT WIL RETURN NULL
	public <Any> Object dealOneCard() {
		Object result = null;
		if (myDeck.size() > 0) {
			result = (Card)myDeck.get(0);
			myDeck.remove(0);
		}
	
		return result;
	}
}
