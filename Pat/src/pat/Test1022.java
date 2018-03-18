package pat;
import java.util.Scanner;

public class Test1022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num=in.nextInt()+in.nextInt();
		int scale=in.nextInt();
		int result=0;
		int count=0;
		do {
			int remainder=num%scale;
			result=(int) (result+remainder*Math.pow(10,count++));
			num=num/scale;
		}while(num>scale);
		result=(int) (result+num*Math.pow(10,count));
		System.out.println(result);

	}

}
