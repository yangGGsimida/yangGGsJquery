package pat;

import java.util.Scanner;

public class Test1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		String spilt[]=str.split("E");
		double front=Double.parseDouble(spilt[0]);
		int back=Integer.parseInt(spilt[1]);
		System.out.println(front);
		System.out.println(back);
		if(back<0) {
			int place=(spilt[0].length()-3)-back;
			System.out.printf("%."+place+"f",front*Math.pow(10, back));
		}else
		System.out.printf("%.0f",front*Math.pow(10, back));

	}

}
