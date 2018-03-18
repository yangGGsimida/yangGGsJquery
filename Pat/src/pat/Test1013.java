package pat;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num1=in.nextInt();
		int num2=in.nextInt();
		Boolean flag=true;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=2;i<=100000;i++) {
			if(list.size()==num2) break;
			flag=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag&&list.size()<=num2) {
				list.add(i);
			}
		}
		for(int i=0;i<num1-1;i++) {
			list.remove(0);
		}
		for(int j=1;j<=list.size();j++) {
			if(j%10!=0&&j!=list.size()) {
			  System.out.print(list.get(j-1)+" ");
			}else {
				System.out.println(list.get(j-1));
			}
		}
		

	}

}
