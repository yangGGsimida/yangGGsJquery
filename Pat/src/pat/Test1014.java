package pat;
import java.util.Scanner;

public class Test1014 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str1=in.nextLine();
		String str2=in.nextLine();
		String str3=in.nextLine();
		String str4=in.nextLine();
		Boolean isFirst=true;
		for(int i=0;i<(str1.length()<str2.length()?str1.length():str2.length());i++) {
			if((str1.charAt(i)==str2.charAt(i))&&str1.charAt(i)>57) {
				if(isFirst) {
					System.out.print(week(str1.charAt(i))+" ");
					isFirst=false;
				}else {
					if(str1.charAt(i)>=48&&str1.charAt(i)<=57) {
						System.out.print("0"+str1.charAt(i)+":");
					}else {
						System.out.print(hour(str1.charAt(i))+":");
					}	
				}	
			}
		}
		for(int i=0;i<(str3.length()<str4.length()?str3.length():str4.length());i++) {
			if(str3.charAt(i)==str4.charAt(i)){
				if((str3.charAt(i)>=65&&str3.charAt(i)<=90)||(str3.charAt(i)>=97&&str3.charAt(i)<=122)) {
					if(i<9) {
						System.out.print("0"+i);
					}else {
						System.out.print(i);
					}
				}
			}
		}

	}
	
	public static String week(char ch) {		
		switch(ch) {
		case 97:
		case 65: return "MON";
		case 98:
		case 66: return "TUE";
		case 99:
		case 67: return "WED";
		case 100:
		case 68: return "THU";
		case 101:
		case 69: return "FRI";
		case 102:
		case 70: return "SAT";
		case 103:
		case 71: return "SUN";	
		default: break;
		}
		return null;
	}
	
	public static String hour(char ch) {
		switch(ch) {
		case 97:
		case 65: return "10";
		case 98:
		case 66: return "11";
		case 99:
		case 67: return "12";
		case 100:
		case 68: return "13";
		case 101:
		case 69: return "14";
		case 102:
		case 70: return "15";
		case 103:
		case 71: return "16";
		case 104:
		case 72: return "17";
		case 105:
		case 73: return "18";
		case 106:
		case 74: return "19";
		case 107:
		case 75: return "20";
		case 108:
		case 76: return "21";
		case 109:
		case 77: return "22";
		case 110:
		case 78: return "23";
		default: break;
		}
		return null;
	}

}
