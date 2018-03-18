package pat;
import java.math.BigInteger;
import java.util.Scanner;

public class Test1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		BigInteger A=in.nextBigInteger();
		BigInteger B=in.nextBigInteger();
		System.out.println(A.divide(B)+" "+A.mod(B));

	}

}
