package pat;
	import java.util.Scanner;
	
	public class Test1009 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in=new Scanner(System.in);
			String str=in.nextLine();
			String split[]=str.split(" ");
			for(int i = split.length-1;i>=0;i--) {
				System.out.print(split[i]);
				if(i!=0) System.out.print(" ");
			}
	
		}
	
	}
