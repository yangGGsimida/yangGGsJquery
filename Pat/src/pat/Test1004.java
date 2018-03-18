package pat;
import java.util.Scanner;

import org.junit.Test;

public class Test1004 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=Integer.parseInt(in.nextLine());
		String s=new String();
		String Maxgrade=new String();
		String Mingrade=new String();
		int max=0; int min=0;
		for(int i=0;i<num;i++) {
			s=in.nextLine();
			int length=s.length();
		    int a=printInt(s);
			if(i==0) {
				Maxgrade=printname(s);
				Mingrade=printname(s);
				max=a;
				min=a;
			}else {
				if(a>max) {
					Maxgrade=printname(s);
					max=a;
				}
				if(a<min) {
					Mingrade=printname(s);
					min=a;
				}
			}
		}
		System.out.println(Maxgrade);
		System.out.println(Mingrade);
	}
	
	public static int printInt(String str) {
		return Integer.parseInt(str.trim().substring(str.lastIndexOf(" ")).trim());
	}
	
	public static String printname(String str) {
		return str.substring(0, str.lastIndexOf(" ")).trim();
	}
	

}
