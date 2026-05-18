package be_study.quiz;

import java.util.Scanner;

public class Quiz20 {
	
	public static void mistake() {
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			
	}
	
	public static void main(String[]args) {
		final int Americano = 3500;
		final int coffeeLatte = 4100;
		final int VanillaLatte = 4300;
		
		int num,count=0;
		int[] menu = new int[3];
		String add_order;

		
		Scanner sc = new Scanner(System.in);
		int i=1;
		while(true) {
			
			System.out.println("======== 메뉴 ========");
			System.out.println("1.아메리카노\t3500원");
			System.out.println("2.카페라떼 \t4100원");
			System.out.println("3.바닐라라떼\t4300원");
			System.out.println("======== 메뉴 ========");
			
			System.out.print("메뉴 선택:");
			num = sc.nextInt()-1;
			if(!(num>=0 && num<3)) {
				
				mistake();
				continue;
			}
			
			System.out.print("수량 선택:");	
			count = sc.nextInt();
			
			for(int j=0; j<3 ;j++) {
				if(num==j) {
					menu[num] += count;
					continue;
				}
			}

			System.out.print("추가 주문하시겠습니까(y/n):");
			add_order = sc.next();
			if(add_order.equals("n")) {
				
				System.out.println("=======================");
				if(menu[0]!=0) {
					System.out.println("아메리카노 "+menu[0]+"잔 : "+ Americano*menu[0]+"원");
				}
				if(menu[1]!=0) {
					System.out.println("카페라떼 "+menu[1]+"잔 : "+ coffeeLatte*menu[1]+"원");
				}
				if(menu[2]!=0) {
					System.out.println("바닐라라떼 "+menu[2]+"잔 : "+ VanillaLatte*menu[2]+"원");
				}
				System.out.println("=======================");
				int sum = Americano*menu[0]+coffeeLatte*menu[1]+VanillaLatte*menu[2];
				System.out.println("총액 : "+sum);
																				
				break;
			}else if(add_order.equals("y")) {
				
				continue;
			}else {
				mistake();
				continue;
			}
			
		
			
		}
			
			
			
			
			
			
	}
}
