package pat;
import java.util.Scanner;  
public class Test10222{  
	public static void main(String[] args){  
		long startTime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);	
		long a = sc.nextLong();
		long b = sc.nextLong();
		long d = sc.nextLong();
		long c  = a+b;
		StringBuilder str = (f(c,d));
		for(int i= str.length()-1 ;i>=0;i--){
			System.out.print(str.charAt(i));
			
		}
		System.out.println();
		long endTime = System.currentTimeMillis();
		System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
	}
	public static StringBuilder f(long a,long d){
		StringBuilder str = new StringBuilder();
		while(a/d!=0){
			str.append(a%d);
			a = a/d;
		}
		str.append(a%d);
		return str;
	}
}