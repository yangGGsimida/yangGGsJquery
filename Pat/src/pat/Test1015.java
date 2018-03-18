package pat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test1015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int L=in.nextInt();
		int H=in.nextInt();
		in.nextLine();
		String StrArr[]=new String[N];
		for(int i=0;i<N;i++) {
			StrArr[i]=in.nextLine();
		}
		ArrayList<String> arr1=new ArrayList<String>();
		ArrayList<String> arr2=new ArrayList<String>();
		for(int i=0;i<N;i++) {
			if(getmorality(StrArr[i])>=H&&gettalent(StrArr[i])>=H) {
				arr1.add(StrArr[i]);
			}
		}
		Collections.sort(arr1,new SortBydecai());
		arr2.addAll(arr1);
		arr1.clear();
		
		for(int i=0;i<N;i++) {
			if(getmorality(StrArr[i])>=H&&gettalent(StrArr[i])<H&&gettalent(StrArr[i])>=L) {
				arr1.add(StrArr[i]);
			}
		}
		Collections.sort(arr1,new SortBydecai());
		arr2.addAll(arr1);
		arr1.clear();
		
		for(int i=0;i<N;i++) {
			if(getmorality(StrArr[i])<H&&gettalent(StrArr[i])<H&&gettalent(StrArr[i])>=L&&getmorality(StrArr[i])>=L&&getmorality(StrArr[i])>=gettalent(StrArr[i])) {
				arr1.add(StrArr[i]);
			}
		}
		Collections.sort(arr1,new SortBydecai());
		arr2.addAll(arr1);
		arr1.clear();
		
		for(int i=0;i<N;i++) {
			if(getmorality(StrArr[i])<H&&gettalent(StrArr[i])>=L&&getmorality(StrArr[i])>=L&&getmorality(StrArr[i])<gettalent(StrArr[i])) {
				arr1.add(StrArr[i]);
			}
		}
		Collections.sort(arr1,new SortBydecai());
		arr2.addAll(arr1);
		arr1.clear();
		System.out.println(arr2.size());
		for(int i=0;i<arr2.size();i++) {
			System.out.println(arr2.get(i));
		}
	}
	
  public static class SortBydecai implements Comparator<String>{
		@Override
		public int compare(String s1, String s2) {
			int morality1=getmorality(s1);
			int morality2=getmorality(s2);
			int talent1=gettalent(s1);
			int talent2=gettalent(s2);
			if(morality1+talent1!=morality2+talent2) {
				return (morality1+talent1)-(morality2+talent2);
			}else {
				if(morality1!=morality2) {
					return morality1-morality2;
				}else {
					return getnum(s1)-getnum(s1);
				}
			}	  
		}
		
	}
	
	public static int getmorality(String str) {
		String spilt[]=str.split(" ");
		return Integer.parseInt(spilt[1]);
	}
	
	public static int gettalent(String str) {
		String spilt[]=str.split(" ");
		return Integer.parseInt(spilt[2]);
	}
	
	public static int getnum(String str) {
		String spilt[]=str.split(" ");
		return Integer.parseInt(spilt[0]);
	}
	

}
