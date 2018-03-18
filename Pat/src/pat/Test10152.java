package pat;
import java.util.Scanner;
import java.util.TreeSet;

public class Test10152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int L=in.nextInt();
		int H=in.nextInt();
		
		TreeSet<stu> both=new TreeSet<stu>();
        TreeSet<stu> dc1 = new TreeSet<stu>();
		TreeSet<stu> dc2 = new TreeSet<stu>();
		TreeSet<stu> dc3 = new TreeSet<stu>();
		while(N!=0) {
			stu s=new stu(in.nextInt(),in.nextInt(),in.nextInt());
			if(s.d<L&&s.c<L) {
				N--;
				continue;
			}
			if(s.d>=H&&s.c>=H)
				both.add(s);
			else if(s.d>=H)
				dc1.add(s);
			else if(s.d>=s.c)
				dc2.add(s);
			else
			    dc3.add(s);
			N--;
		}
			System.out.println(both.size()+dc1.size()+dc2.size()+dc3.size());
			print(both);
			print(dc1);
			print(dc2);
			print(dc3);
			in.close();
		

	}	
	
	static class stu implements Comparable<stu>{
		int id,d,c,sum;
		public stu(int id,int d,int c) {
			this.id=id;
			this.d=d;
			this.c=c;
			this.sum=d+c;
		}
		@Override
		public int compareTo(stu o) {
			if(this.sum!=o.sum) return this.sum-o.sum;
			if(this.d!=o.d) return this.d-o.d;
			return this.id-o.id;
		}
	}
	
	private static void print(TreeSet<stu> set) {
		for(stu s:set) {
			System.out.println(s.id+" "+s.d+" "+s.c);
		}
	}
	
	

}
