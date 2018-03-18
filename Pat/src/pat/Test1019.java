package pat;
import java.util.Arrays;
import java.util.Scanner;

public class Test1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis(); 
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int ans=decrease(num)-increase(num);
		if(ans==0) {
			System.out.printf("%04d - %04d = %04d\n",decrease(num),increase(num),ans); 
		}else {
			do {
				int x=decrease(num)-increase(num);
				System.out.printf("%04d - %04d = %04d\n",decrease(num),increase(num),x); 
				num=x;
			}while(num!=6174);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("程序运行时间：" + (endTime - startTime) + "ms");

	}
	
	private static int decrease(int n) {
		int num[]=new int[4];
		num[0]=n/1000;
		num[1]=n/100%10;
		num[2]=n/10%10;
		num[3]=n%10;
		Arrays.sort(num);
		return num[3]*1000+num[2]*100+num[1]*10+num[0];
	}
	
	private static int increase(int n) {
		int num[]=new int[4];
		num[0]=n/1000;
		num[1]=n/100%10;
		num[2]=n/10%10;
		num[3]=n%10;
		Arrays.sort(num);
		return num[0]*1000+num[1]*100+num[2]*10+num[3];
	}
	

}
