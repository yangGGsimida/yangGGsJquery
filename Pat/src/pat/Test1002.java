package pat;
import java.util.Scanner;

public class Test1002 {
	/*读入一个自然数n，计算其各位数字之和，用汉语拼音写出和的每一位数字。

	输入格式：每个测试输入包含1个测试用例，即给出自然数n的值。这里保证n小于10的100次方。(可知n位数之和最多三位数)

	输出格式：在一行内输出n的各位数字之和的每一位，拼音数字间有1 空格，但一行中最后一个拼音数字后没有空格。

	输入样例：
	1234567890987654321123456789
	输出样例：
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
