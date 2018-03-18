package cn.game;

import java.util.ArrayList;

/*Íæ¼ÒÀà*/
public class Player {
	private String name;
	private ArrayList<Cart> playscarts=new ArrayList<Cart>();
	private int value=0;
	
	public Player() {}
	
	public Player(String name) {
		this.name=name;
	}
	
	public void getCart(Cart cart) {
		playscarts.add(cart);
		int length=playscarts.size();
	    value+=StringToValue(cart.getCount());
	}
	
	public Boolean Test21() {
		return value>21?true:false;
	}
	
	public int StringToValue(String str) {
		switch(str) {
		case "A": return 1;
		case "2": return 2;
		case "3": return 3;
		case "4": return 4;
		case "5": return 5;
		case "6": return 6;
		case "7": return 7;
		case "8": return 8;
		case "9": return 9;
		case "10": return 10;
		case "J": return 10;
		case "Q": return 10;
		case "K": return 10;
		}
		return 0;
	}
	
	public void showcarts() {
		for(int i=0;i<playscarts.size();i++) {
			System.out.println(playscarts.get(i));
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getValue() {
		return this.value;
	}
	

}
