package pat;

import java.util.Scanner;

public class Test1025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String FirstAddress=in.next();
		int num=in.nextInt();
		int swapindex=in.nextInt();
		in.nextLine();
		LinkedList list[]=new LinkedList[num];
		for(int i=0;i<num;i++) {
			LinkedList a=new LinkedList();
			a.address=in.next();
			a.data=in.nextInt();
			a.nextaddress=in.next();
			list[i]=a;
		}
		for(int i=0;i<num;i++) {
			list[i].next=query(list,list[i].nextaddress);
		}
		LinkedList node=query(list,FirstAddress);
		while(node!=null) {
			System.out.println(node);
			node=node.next;
		}

	}
	
	public static LinkedList query(LinkedList list[],String address) {
		for(int i=0;i<list.length;i++) {
			if(list[i].address.equals(address))
				return list[i];
		}
		return null;
		
	}
	
	public static class LinkedList {
		String address;
		int data;
		String nextaddress;
		LinkedList next;
		
		public LinkedList() {
			
		}

		@Override
		public String toString() {
			if(next!=null)
			return address+" "+data+" "+next.address;
			else
				return address+" "+data+" -1";
		}
		
	}

}
