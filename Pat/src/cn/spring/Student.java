package cn.spring;

public class Student {
	private Card card;
	
	public void cardspeak() {
		System.out.println(card);
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
	
	

}
