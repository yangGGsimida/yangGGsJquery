package cn.suanfa;

public class Merge extends SortModel{
	
	private static Comparable[] aux;//归并所需要的辅助数组
	
	public static void sort(Comparable[] a) {
		aux=new Comparable[a.length];
		sort(a,0,a.length-1);
	}
	
	public static void sort(Comparable[] a,int lo,int hi) {
		if(hi<=lo) return;//当只有一个元素的时候立刻返回
		int mid=lo+(hi-lo)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		merge(a,lo,mid,hi);
	}
	
	public static void merge(Comparable[] a,int lo,int mid,int hi) {
		int i=lo,j=mid+1;
		for(int k=lo;k<=hi;k++) {
			aux[k]=a[k]; //复制原数组
		}
		for(int k=lo;k<=hi;k++) {
			if(i>mid) a[k]=aux[j++];  //只有当i不断的++才有可能超过mid，此时左边已经排好，后边的依次就行
			else if(j>hi) a[k]=aux[i++]; //右边排完，左边没排完的依次
			else if(less(aux[j],aux[i])) a[k]=aux[j++];//右边比左边小的放在左边，知道有一边排完
			else a[k]=aux[i++];
		}
	}

}
