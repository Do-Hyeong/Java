package chapter_7;

public class Page_232 {
	public static void main(String[] args) {
		Deck deck = new Deck();
//		for (int i = 0; i < 51; i++) {
//			System.out.println(deck.randomPick());
//		}
//		System.out.println("Remain Card Amount : " + deck.getCardAmount());
//		System.out.println("Last Card : " + deck.randomPick());
		
		deck.shuffle();
		for (int index = 51; index >= 0; index--) {
			System.out.println(deck.pick(index));
		}
		System.out.println("Remain Card Amount : " + deck.getCardAmount());
	}
}

class Deck {
	private int cardAmount = 52;
	private Card[] cards = new Card[cardAmount];
	
	public int getCardAmount() {
		return cardAmount;
	}
	public void setCardAmount(int cardAmount) {
		this.cardAmount = cardAmount;
	}
	public Card[] getCards() {
		return cards;
	}
	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	public Deck() {
		int index = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cards[index++] = new Card(i, j);
			}
		}
	}
	
	public Card pick(int index) {
		Card pick = null;
		if (cardAmount > 0 && index >= 0 && index < cardAmount) {
			pick = cards[index];
			cardAmount--;
			for (int i = index; i < cardAmount; i++) {
				cards[i] = cards[i+1];
			}
		}
		return pick;
	}
	
	public Card randomPick() {
		return pick((int) (Math.random() * this.cardAmount));
	}
	
	public void shuffle() {
		if (cardAmount > 0) {
			for (int i = 0; i < 1000; i++) {
				int randomNumber = (int) (Math.random() * this.cardAmount);
				Card temp = cards[0];
				cards[0] = cards[randomNumber];
				cards[randomNumber] = temp;
			}			
		}
	}
}

class Card {
	private int shape;
	private int num;
	
//	public Card() {
//		this(0, 0);
//	}
	
	public Card(int shape, int num) {
		setShape(shape);
		setNum(num);
	}

	public int getShape() {
		return shape;
	}
	public void setShape(int shape) {
		if(shape < 4) {
			this.shape = shape;
		}		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if(num < 13) {
			this.num = num;
		}		
	}

	@Override
	public String toString() {
		String s = "";
		String n = "";
		
		switch (this.shape) {
		case 0:
			s = "SPADE";
			break;
		case 1:
			s = "HART";
			break;
		case 2:
			s = "CLOVER";
			break;
		case 3:
			s = "DIAMOND";
			break;
		default:
			break;
		}
		
		switch (this.num) {
		case 10:
			n = "J";
			break;
		case 11:
			n = "Q";
			break;
		case 12:
			n = "K";
			break;
		case 0:
			n = "A";
			break;
		default:
			n = Integer.toString(this.num + 1);
			break;
		}
		
		return "[" + s + ", " + n + "]";
	}
}
