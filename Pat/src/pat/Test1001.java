package pat;
import java.util.Scanner;

public class Test1001 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int time=0;
		while(true) {
			if(num==1) break;
			if(num%2==0) {
				num=num/2;
			}else {
				num=(3*num+1)/2;
			}
			time++;
		}
		System.out.println(time);
	}

}
