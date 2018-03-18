package pat;
import java.util.Scanner;

public class Test1023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int intArr[]=new int[10];
		for(int i=0;i<10;i++) {
			intArr[i]=in.nextInt();
		}
		for(int i=1;i<10;i++) {
			if(intArr[i]!=0) {
				System.out.print(i);
				intArr[i]--;
				break;
			}
		}
		
		for(int i=0;i<intArr[0];i++) {
			System.out.print(0);
		}	
		
		for(int i=1;i<10;i++) {
			while(intArr[i]-->0) {
				System.out.print(i);
			}
		}
		System.out.println();
	}


}
