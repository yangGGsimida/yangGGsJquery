package pat;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1020 {

	public static void main(String[] args) {
		long stime=System.currentTimeMillis();
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int demand=in.nextInt();
		in.nextLine();
		String repertory=in.nextLine();
		String totalprice=in.nextLine();
		ArrayList<mooncake> list=new ArrayList<mooncake>();
		for(int i=0;i<num;i++) {
			mooncake cake=new mooncake(Integer.parseInt(repertory.split(" ")[i]),Integer.parseInt(totalprice.split(" ")[i]));
			list.add(cake);
		}
		double maxprofit=0;
		do {
			int maxunitpriceindex=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).unitprice>list.get(maxunitpriceindex).unitprice) {
				maxunitpriceindex=i;
			}
		}
		if(demand<list.get(maxunitpriceindex).repertory) {
			maxprofit+=demand*list.get(maxunitpriceindex).unitprice;
			demand=0;
		}else {
			maxprofit+=list.get(maxunitpriceindex).totalprice;
			demand=demand-list.get(maxunitpriceindex).repertory;
			list.remove(maxunitpriceindex);
		}
		}while(demand>0);
		
		System.out.printf("%.2f",maxprofit);
		long etime=System.currentTimeMillis();
		System.out.println("程序运行时间："+(etime-stime)+"ms");
		

	}
	
	static class mooncake {
		int repertory,totalprice;
		double unitprice;
		
		public mooncake(int repertory,int totalprice) {
			this.repertory=repertory;
			this.totalprice=totalprice;
			this.unitprice=totalprice/(double)repertory;
		}
	}

}
