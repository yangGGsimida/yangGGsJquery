package cn.suanfa;

import edu.princeton.cs.algs4.StdDraw;

public class StdDrawTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=100;
		StdDraw.setXscale(0,N);
		StdDraw.setYscale(0,N);
		StdDraw.setPenRadius(.01);
		for(int i=1;i<=N;i++) {
			StdDraw.point(i, i);
			StdDraw.point(i, i*i);
		}

	}

}
