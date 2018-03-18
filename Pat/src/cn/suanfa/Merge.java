package cn.suanfa;

public class Merge extends SortModel{
	
	private static Comparable[] aux;//�鲢����Ҫ�ĸ�������
	
	public static void sort(Comparable[] a) {
		aux=new Comparable[a.length];
		sort(a,0,a.length-1);
	}
	
	public static void sort(Comparable[] a,int lo,int hi) {
		if(hi<=lo) return;//��ֻ��һ��Ԫ�ص�ʱ�����̷���
		int mid=lo+(hi-lo)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		merge(a,lo,mid,hi);
	}
	
	public static void merge(Comparable[] a,int lo,int mid,int hi) {
		int i=lo,j=mid+1;
		for(int k=lo;k<=hi;k++) {
			aux[k]=a[k]; //����ԭ����
		}
		for(int k=lo;k<=hi;k++) {
			if(i>mid) a[k]=aux[j++];  //ֻ�е�i���ϵ�++���п��ܳ���mid����ʱ����Ѿ��źã���ߵ����ξ���
			else if(j>hi) a[k]=aux[i++]; //�ұ����꣬���û���������
			else if(less(aux[j],aux[i])) a[k]=aux[j++];//�ұ߱����С�ķ�����ߣ�֪����һ������
			else a[k]=aux[i++];
		}
	}

}
