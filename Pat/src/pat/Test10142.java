package pat;
import java.util.Scanner;
public class Test10142 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		String s4 = sc.next();
		String date[] = { "MON","TUE","WED","THU","FRI","SAT","SUN" };
		int time[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
		System.out.print(date[Gfw(s1,s2)]+" ");
		System.out.printf("%02d:", time[Gsw(s1,s2)]);
		System.out.printf("%02d\n",getfz(s3 ,s4));
		
		
	}
	public static int Gfw(String s1,String s2){		//	获得第一个相同的大写字母
		int len1 = s1.length();

		for(int i=0;i<len1 ;i++){
			if(isUpcase(s1,i)){
				if(s1.charAt(i)==s2.charAt(i)){
					return s1.charAt(i)-65;
				}
			}
		}
		return 0;
	}
	public static int get(String s1 ,String s2){		//	获取第一个相同的大写字母的位置
		int k = Gfw(s1,s2)+65;
		for(int i=0 ;i<s1.length() ;i++){
			if(s1.charAt(i)==k){
				return i;
			}
		}
		return 0;
		
	}
	
		
	
	public static int Gsw(String s1,String s2){		//	获得第二个相同的字符  可以是数字或者A-N的字母
		int len1 = s1.length();
		for(int i=get(s1 ,s2)+1;i<len1 ;i++){
			if(isNum(s1,i)){
				if(s1.charAt(i)==s2.charAt(i)){
					return s1.charAt(i)-48;
				}	
			}
			if(isUp2(s1,i)){
				if(s1.charAt(i)==s2.charAt(i)){
					return s1.charAt(i)-55;
				}
			}
		}
		return 0;
	}
	
	
	public static int getfz(String s1,String s2){			//	获取分钟
		int len1 = s1.length();
		for(int i=0 ;i<len1 ;i++){
			if(iszimu(s1,i)){
				if(s1.charAt(i)==s2.charAt(i)){
					return i;
				}
			}
		}
		return 0;
	}
	
	public static boolean isUpcase(String s,int i){			//	判断是否是A-G的大写字母
		if(s.charAt(i)>=65&&s.charAt(i)<=71){
			return true;
		}
		return false;
	}
	
	public static boolean isNum(String s,int i){
		if((s.charAt(i)>=48&&s.charAt(i)<=57)){		//	判断是否是0-9的数字
			return true;
		}
		return false;
	}
	public static boolean isUp2(String s,int i){
		if((s.charAt(i)>=65&&s.charAt(i)<=78)){		//	判断是否是A-N大写字母
			return true;
		}
		return false;
	}
	
	public static boolean iszimu(String s,int i){
		if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122)){		//	判断是否是英文字母
			return true;
		}
		return false;
	}
	
	
}
