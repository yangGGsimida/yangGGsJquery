package pat;
import java.util.Scanner;

public class Test1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int time=in.nextInt();
		in.nextLine();
		int intarr[]=new int[num];
		for(int i=0;i<num;i++) {
			intarr[i]=in.nextInt();
		}
		for(int j=1;j<=time;j++) {
			int temp=intarr[num-1];
			for(int m=num-2;m>=0;m--) {
				intarr[m+1]=intarr[m];
			}
			intarr[0]=temp;
		}
		for(int n=0;n<num;n++) {
			System.out.print(intarr[n]);
			if(n!=num-1) System.out.print(" ");
		}
		}

}
