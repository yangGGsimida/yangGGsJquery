package cn.suanfa;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {
	private Node<Item> first;
	private Node<Item> last;
	private int size;
	
	public Queue() {
		first=null;
		last=null;
		size=0;
	}
	
	public boolean isEmpty() {
		return first==null;
	}
	
	public int size() {
		return size;
	}
	
	public void enqueue(Item item) {
		Node<Item> node=new Node<Item>();
		node.item=item;
		node.next=null;
		if(isEmpty()) {//��������ǿյģ���ô���׺Ͷ�βָ����ͬһ���ڵ�
			first=node;
			last=node;
		}else {
			last.next=node;
			last=last.next;
		}
		size++;
	}
	
	public Item dequeue() throws Exception {
		if(isEmpty()) throw new Exception("�������Ѿ�û�ж�������");
		Item item=first.item;
		first=first.next;
		size--;
		if(isEmpty()) last=null;//������������ֻ��һ������ô���׺Ͷ�β��ָ������������Ҫ���ˣ�����Ҫ�ö���ָnull����βҲҪָnull
		return item;
	}
	
	
	private class Node<Item>{
		private Item item;
		private Node<Item> next;
	}
	
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue<String> queue=new Queue<String>();
		queue.enqueue("yanggg");
		queue.enqueue("wangjue");
		queue.enqueue("lalalal");
		for(String s:queue) {
			System.out.println(s);
		}
		queue.dequeue();
		for(String s:queue) {
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
		
		public ListIterator(Node<Item> first) {
			current=first;
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
