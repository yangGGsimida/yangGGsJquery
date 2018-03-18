package cn.suanfa;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
	private Node<Item> First;
	private int size;
	
	public Bag() {
		First=null;
		size=0;
	}
	
	public void add(Item item) {
		Node<Item> oldnode=First;
		Node<Item> node=new Node<Item>();
		node.item=item;
		node.next=oldnode;
		First=node;
	}
	
	public boolean isEmpty() {
		return First==null;
	}
	
	public int size() {
		return size;
	}
	
	private static class Node<Item>{
		private Item item;
		private Node<Item> next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag<String> bag=new Bag<String>();
		bag.add("yang");
		bag.add("wangjue");
		bag.add("lalalal");
		for(String s:bag) {
			System.out.println(s);
		}
		Bag<String> bag2=bag;
		for(String s:bag2) {
			System.out.println(s);
		}
		bag.add("dasdasd");
		for(String s:bag2) {
			System.out.println(s);
		}
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Item>{
		private Node<Item> current;
		
		public ListIterator() {
			current=First;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=null;
		}

		@Override
		public Item next() {
			Item item=current.item;
			current=current.next;
			return item;
		}
		
	}

}
