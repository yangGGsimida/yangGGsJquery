package cn.suanfa;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>{
	private Node<Item> first;
	private int size;
	
	public Stack() {
		first=null;
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return first==null;
	}
	
	public void push(Item item) {
		Node<Item> node=new Node<Item>();
		node.item=item;
		node.next=first;
		first=node;
		size++;
	}
	
	public Item pop() throws Exception {
		if(isEmpty()) throw new Exception("Õ»Ã»¶«Î÷À²£¡");
		Item item=first.item;
		first=first.next;
		size--;
		return item;
	}
	
	private class Node<Item>{
		private Item item;
		private Node<Item> next;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack<String> stack=new Stack<String>();
		stack.push("yanggg");
		stack.push("wangjue");
		stack.push("lalallala");
		for(String s:stack) {
			System.out.println(s);
		}
		stack.pop();
		for(String s:stack) {
			System.out.println(s);
		}

	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator<Item>(first);
	}
	
	private class ListIterator<Item> implements Iterator<Item>{
		private Node<Item> current; 
		
		public ListIterator(Node<Item> node){
			current=node;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			Item item=current.item;
			current=current.next;
			return item;
		}
		
	}

}
