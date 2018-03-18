package pat;
import java.util.Scanner;

public class Test1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		parsehundred(num/100);
		parseten((num%100)/10);
		parsege(num%10);

	}
	
	public static void parsehundred(int num) {
		while(num>0) {
			System.out.print("B");
			num--;
		}
	}
	public static void parseten(int num) {
		while(num>0) {
			System.out.print("S");
			num--;
		}
	}
	public static void parsege(int num) {
		int i=1;
		while(num>=i) {
			System.out.print(i);
			i++;
		}
	}

}
