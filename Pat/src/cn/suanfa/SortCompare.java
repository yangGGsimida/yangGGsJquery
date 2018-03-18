package cn.suanfa;

import java.math.BigInteger;
import java.util.Scanner;

import org.junit.Test;

import cn.suanfa.lib.StdRandom;
import cn.suanfa.lib.Stopwatch;

public class SortCompare {
	
	public static double time(String alg,Double[] a) {
		Stopwatch timer=new Stopwatch();
		if(alg.equals("Insertion")) Insertion.sort(a);
		if(alg.equals("Selection")) Selection.sort(a);
		if(alg.equals("Shell")) Shell.sort(a);
		if(alg.equals("Merge")) Merge.sort(a);
		/*if(alg.equals("Shell"))*/
		return timer.elapsedTime();
		
	}
	
	public static double timeRandomInput(String alg,int N,int T) {
		double total=0.0;
		Double a[]=new Double[N];
		for(int t=0;t<T;t++) {
			for(int i=0;i<N;i++)
				a[i]=StdRandom.uniform();
			total+=time(alg,a);
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String alg1=in.next();
		String alg2=in.next();
		int N=in.nextInt();
		int T=in.nextInt();
		double t1=timeRandomInput(alg1,N,T);
		double t2=timeRandomInput(alg2,N,T);
		System.out.printf("对于%d个随机数组，%s花费了%fs\n",N,alg1,t1);
		System.out.printf("对于%d个随机数组，%s花费了%fs",N,alg2,t2);
		
	}
	
	public static BigInteger function(BigInteger num) {
		if(num.equals(1)) return num;
		if(num.compareTo((new BigInteger("1")))>0 )return num.multiply(function(num.subtract(new BigInteger("1"))));
		return BigInteger.ZERO;
	}
	@Test
	public void test() {
		Scanner in=new Scanner(System.in);
		BigInteger num=in.nextBigInteger();
		BigInteger result=function(num);
		System.out.println(result);
		int count=0;
		while(result.remainder(new BigInteger("10")).equals(0)) {
			count++;
			result=result.divide(new BigInteger("10") );
		}
		System.out.println(count);
		
		
	}


}
