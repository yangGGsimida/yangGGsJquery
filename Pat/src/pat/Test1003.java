package pat;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1003 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int strnum=Integer.parseInt(in.nextLine());
		String pattern="A*PA{1,2}TA*";
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<strnum;i++) {
			list.add(in.nextLine());
		}
		for(String str:list) {
			if(str.matches(pattern)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
