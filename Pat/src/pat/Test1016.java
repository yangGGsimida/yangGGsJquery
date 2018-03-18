package pat;
import java.util.Scanner;

public class Test1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<2;i++) {
			int A=in.nextInt();
			int DA=in.nextInt();
			sum+=function(A,DA);
		}
		System.out.println(sum);

	}
	
	private static int function(int A,int DA) {
		int sum=0;
		int time=0;
		while(A!=0) {
			if(DA==(A%10)) {
				sum+=Math.pow(10,time++)*DA;
			}
			A=A/10;
		}
		return sum;
	}
	
	

}
