package pat;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		Boolean flag=true;
		int total=0;
		int num=in.nextInt();
		for(int i=2;i<=num;i++) {
			flag=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				list.add(i);
			}
		}
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(i+1)-list.get(i)==2) {
				total++;
			}
		}
		System.out.println(total);

	}

}
