package cn.suanfa;

public class FixedCapacityStackOfStrings {
	private String[] StrArr;
	private int N;
	
	public FixedCapacityStackOfStrings(int cap) {
		StrArr=new String[cap];
		N=0;
	}
	
	public boolean isEmpty() {
		return N==0;
	}
	
	public int size() {
		return N;
	}
	
	public void push(String s) {
		StrArr[N]=s;
		N++;
	}
	
	public String pop() {
		return StrArr[--N];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
