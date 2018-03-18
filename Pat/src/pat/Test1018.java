package pat;
import java.util.Scanner;

public class Test1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		in.nextLine();
		int grade[]=new int[3];
		int JB=0,JC=0,JJ=0;
		int YB=0,YC=0,YJ=0;
		for(int i=0;i<num;i++) {
			char jia=in.next().charAt(0);
			char yi=in.next().charAt(0);
			if(jia=='J') {
				if(yi=='J') {
					grade[1]++;
				}else if(yi=='B') {
					JJ++;
					grade[0]++;
				}else if(yi=='C') {
					YC++;
					grade[2]++;
				}
			}else if(jia=='C') {
				if(yi=='C') {
					grade[1]++;
				}else if(yi=='B') {
					YB++;
					grade[2]++;
				}else if(yi=='J') {
					JC++;
					grade[0]++;
				}
			}else {
				if(yi=='B') {
					grade[1]++;
				}else if(yi=='C') {
					JB++;
					grade[0]++;
				}else {
					YJ++;
					grade[2]++;
				}
			}
		}
		System.out.println(grade[0]+" "+grade[1]+" "+grade[2]);
		System.out.println(grade[2]+" "+grade[1]+" "+grade[0]);
		
		int Jmax=JB;
		char J='B';
		if(JC>Jmax) {
			J='C';
		}
		if(JJ>Jmax) {
			J='J';
		}
		System.out.print(J+" ");
		
		int Ymax=YB;
		char Y='B';
		if(YC>Jmax) {
			Y='C';
		}
		if(YJ>Jmax) {
			Y='J';
		}
		System.out.print(Y);

	}
	

}
