package pat;
import java.math.BigInteger;
import java.util.Scanner;

public class Test1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		in.nextLine();
		BigInteger Binteger[][]=new BigInteger[num][3];
		for(int i=0;i<num;i++) {
			for(int j=0;j<3;j++) {
				Binteger[i][j]=in.nextBigInteger();
			}
		}
		in.close();
		for(int i=0;i<num;i++) {
			System.out.println("Case #"+(i+1)+": "+(Binteger[i][0].add(Binteger[i][1]).compareTo(Binteger[i][2])==1));
		}
			
		}
}
