package pat;
import java.util.Scanner;


public class Test1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String split[]=str.split(" ");
		int A1=0;
		int A2=0;
		int A3=0;
		int A4=0;
		int A5=0;
		int A4time=0;
		Boolean bool=true;
		int intarr[]=new int[split.length];
		for(int i=0;i<split.length;i++) {
			intarr[i]=Integer.parseInt(split[i]);
		}
		for(int i=0;i<split.length;i++) {
			int num=intarr[i];
			if(num%5==0&&num%2==0) {
				A1+=intarr[i];
			}
			if(num%5==1) {
				if(bool) {
					A2+=num;
					bool=false;
				}else {
					A2-=num;
					bool=true;
				}
			}
			if(num%5==2) {
				A3++;
			}
			if(num%5==3) {
				A4+=num;
				A4time++;
			}
			if(num%5==4) {
				if(num>A5) {
					A5=num;
				}
			}
		}
		show(A1,A1,true);
		show(A2,A2,true);
		show(A3,A3,true);
		if(A4time!=0) {
			System.out.print((double)A4/A4time+" ");
		}else {
			System.out.print("N ");
		}
		show(A5,A5,false);
	}
	
	public static void show(int A,int num,Boolean bool) {
		if(num!=0) {
			if(bool) {
				System.out.print(A+" ");
			}else {
				System.out.print(A);
			}	
		}else {
			if(bool) {
				System.out.print("N ");
			}else {
				System.out.print("N");
			}		
		}
	}
	

}
