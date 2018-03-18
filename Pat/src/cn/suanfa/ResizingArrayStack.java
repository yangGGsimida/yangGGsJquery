package cn.suanfa;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item> {
	private Item[] itemArr=(Item[]) new Object[1];
	private int N;
	
	public boolean isEmpty() {
		return N==0;
	}
	
	public int size() {
		return N;
	}
	
	private void resetsize(int size) {
		Item[] item=(Item[]) new Object[size];
		for(int i=0;i<N;i++) {
			item[i]=itemArr[i];
		}
		itemArr=item;
	}
	
	public void push(Item item) {
		if(N==itemArr.length) resetsize(2*itemArr.length);
		itemArr[N++]=item;
	}
	
	public Item pop() throws Exception {
		if(isEmpty()) throw new Exception("Ã»¶«Î÷À²£¡");
		Item item=itemArr[--N];
		itemArr[N]=null;
		if(N==itemArr.length/4) resetsize(itemArr.length/2);
		return item;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResizingArrayStack<String> stack=new ResizingArrayStack<String>();
		stack.push("yanggg");
		System.out.println(stack.size());
		stack.push("wangjue");
		System.out.println(stack.size());
		stack.push("llalalla");
		System.out.println(stack.size());

	}

	@Override
	public Iterator<Item> iterator()  {
		// TODO Auto-generated method stub
		return new StackIterator(N);
	}
	
	private class StackIterator<Item> implements Iterator<Item>{
		private int i;
		
		public StackIterator(int N) {
			this.i=N;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i>0;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return (Item) itemArr[--i];
		}
		
	}
	
	

}
