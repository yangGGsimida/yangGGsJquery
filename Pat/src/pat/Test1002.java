package pat;
import java.util.Scanner;

public class Test1002 {
	/*����һ����Ȼ��n���������λ����֮�ͣ��ú���ƴ��д���͵�ÿһλ���֡�

	�����ʽ��ÿ�������������1��������������������Ȼ��n��ֵ�����ﱣ֤nС��10��100�η���(��֪nλ��֮�������λ��)

	�����ʽ����һ�������n�ĸ�λ����֮�͵�ÿһλ��ƴ�����ּ���1 �ո񣬵�һ�������һ��ƴ�����ֺ�û�пո�

	����������
	1234567890987654321123456789
	���������
	yi san wu*/

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String num=in.nextLine();
		int index=0;
		int total=0;
		while(index++<num.length()) {
			total+=Integer.parseInt(num.substring(index-1, index));
		}
		System.out.println(NumToChinese(total));

	}
	public static String NumToChinese(int num) {
		String pinyin[]= {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
		int first=num/100;
		int second=(num%100)/10;
		int third=num%10;
		if(first==0) {
			if(second==0) {
				return pinyin[third];
			}else {
				return pinyin[second]+" "+pinyin[third];
			}	
		}else {
				return pinyin[first]+" "+pinyin[second]+" "+pinyin[third];		
		}
		
	}

}
