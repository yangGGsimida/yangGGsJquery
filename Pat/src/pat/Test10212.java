package pat;
import java.util.Scanner;

public class Test10212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String num=in.next();
		int NumArr[]=new int[9];
		for(int i=0;i<9;i++) {
			NumArr[num.charAt(i)-48]++;
		}
		for(int i=0;i<9;i++) {
			if(NumArr[i]!=0) {
				System.out.printf("%d:%d\n",i,NumArr[i]);
			}
		}

	}

}
