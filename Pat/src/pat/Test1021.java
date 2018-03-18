package pat;
import java.util.Scanner;

public class Test1021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int NumArr[]=new int[9];
		while(num!=0) {
			NumArr[num%10]++;
			num=num/10;
		}
		for(int i=0;i<9;i++) {
			if(NumArr[i]!=0) {
				System.out.println(i+":"+NumArr[i]);
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("程序运行时间： " + (endTime - startTime) + "ms");

	}

}
