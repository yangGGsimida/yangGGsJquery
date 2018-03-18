package cn.game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CartTable {
	/*ö�ٻ�ɫ����*/
	private static Suits Suit[]=new Suits[] {Suits.Spade,Suits.Heart,Suits.Diamond,Suits.Club};
	/*ö�ٵ�������*/
	private static Counts Count[]=new Counts[] {Counts.ACE,Counts.NUM2,Counts.NUM3,Counts.NUM4,Counts.NUM5,Counts.NUM6,Counts.NUM7,Counts.NUM8,Counts.NUM9,Counts.NUM10,Counts.J,Counts.Q,Counts.K};
	/*δ�����ֽ�Ƽ���*/
	private static ArrayList<Cart> UnChooseCart=new ArrayList<Cart>();
	
	private static Player player1=new Player();
	
	private static Player player2=new Player();
	static {
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				UnChooseCart.add(new Cart(Suit[i].name(),Count[j].value));
			}
		}
	}
	
	public static void RandomgetCart(Player player,int num) {
		Random rand = new Random();
		for(int i=0;i<num;i++) {
			int randomnum=rand.nextInt(UnChooseCart.size()-1);
			player.getCart(UnChooseCart.get(randomnum));
			UnChooseCart.remove(randomnum);
		}
	}
	
	public static Player CompareCount(Player player1,Player player2) {
		return player1.getValue()>player2.getValue()?player1:player2;
	}
		
	public static void start() {
		Scanner in =new Scanner(System.in);
		System.out.print("�������һλ��ҵ�������");
		player1.setName(in.nextLine());
		System.out.print("������ڶ�λ��ҵ�������");
		player2.setName(in.nextLine());
		RandomgetCart(player1,1);
		RandomgetCart(player2,1);
		Boolean p1=true,p2=true;
		while(p1||p2) {
			if(p1) {
			System.out.println("------"+"���"+player1.getName()+"�ĻغϿ�ʼ------");
			player1.showcarts();
			System.out.print("�Ƿ�Ҫ�ƣ�yes/no");
			if(in.nextLine().equals("yes")) {
				p1=true;
				RandomgetCart(player1,1);
				player1.showcarts();
			}else {
				p1=false;
			}
			System.out.println("------"+"���"+player1.getName()+"�ĻغϽ���------");
			}
			
			if(p2) {
				System.out.println("------"+"���"+player2.getName()+"�ĻغϿ�ʼ------");
				player2.showcarts();
				System.out.print("�Ƿ�Ҫ�ƣ�yes/no");
				if(in.nextLine().equals("yes")) {
					p2=true;
					RandomgetCart(player2,1);
					player2.showcarts();
				}else {
					p2=false;
				}
				System.out.println("------"+"���"+player2.getName()+"�ĻغϽ���------");
				}
			}
		p1=player1.Test21();
		p2=player2.Test21();
		if(p1&&p2) {
			System.out.println("��tmd����");
		}else if(p1==true&&p2==false) {
			System.out.println("���"+player2.getName()+"Ӯ�ˡ�");
		}else if(p2==true&&p1==false) {
			System.out.println("���"+player1.getName()+"Ӯ�ˡ�");
		}else {
			System.out.println("���"+CompareCount(player1,player2).getName()+"Ӯ�ˡ�");
		}
		
			
		}
	}
	

