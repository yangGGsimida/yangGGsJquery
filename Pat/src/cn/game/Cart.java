package cn.game;
/*÷Ω≈∆¿‡*/
public class Cart {
	private String Suit;
	private String Count;
	
	public Cart() {}
	
	public Cart(String Suit,String Count) {
		this.Suit=Suit;
		this.Count=Count;
	}

	public String getSuit() {
		return Suit;
	}

	public void setSuit(String suit) {
		Suit = suit;
	}

	public String getCount() {
		return Count;
	}

	public void setCount(String count) {
		Count = count;
	}

	@Override
	public String toString() {
		return Suit+Count;
	}
	
	
	

}
