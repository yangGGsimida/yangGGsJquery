package pat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test10202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int demand=in.nextInt();
		in.nextLine();
		ArrayList<mooncake> list=new ArrayList<mooncake>();
		for(int i=0;i<num;i++) {
			mooncake cake=new mooncake();
			cake.repertory=in.nextInt();
			list.add(cake);
		}
		for(int i=0;i<num;i++) {
			list.get(i).totalprice=in.nextInt();
			list.get(i).unitprice=(double)(list.get(i).totalprice)/list.get(i).repertory;
		}
		Collections.sort(list,new Comparator<mooncake>() {
			@Override
			public int compare(mooncake arg0, mooncake arg1) {
				if(arg0.unitprice>arg1.unitprice) {
					return -1;
				}else if(arg0.unitprice<arg1.unitprice) {
					return 1;
				}else {
					return 0;
				}
			}
		});
		double maxprofit=0;
		for(int i=0;i<num;i++) {
			if(demand<list.get(i).repertory) {
				maxprofit+=demand*list.get(i).unitprice;
				break;
			}else {
				maxprofit+=list.get(i).totalprice;
				demand=demand-list.get(i).repertory;
			}
		}
		System.out.printf("%.2f",maxprofit);

	}
	
	static class mooncake {
		int repertory,totalprice;
		double unitprice;		
	}

}