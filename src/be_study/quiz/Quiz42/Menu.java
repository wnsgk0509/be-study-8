package be_study.quiz.Quiz42;

import java.util.Scanner;

public class Menu {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		Tteokbokki tt = new Tteokbokki("떡볶이",6000,10,1);
		Gimbab gg = new Gimbab("김밥",4000,10,2);
		Sundae ss = new Sundae("순대",7000,10,3);
		
		Menu[] arr = {tt, gg ,ss};
		
		int input_food_id=0;	//사용자가 메뉴 고를때 받을 변수 #반드시 로직완료 후 0 초기화
		int  add_count=0;		//사용자 재고 추가에 개수
		
		while(true) {
			System.out.print("1.메뉴판보기 ");
			System.out.print("2.주문하기 ");
			System.out.print("3.재고관리 ");
			System.out.print("4.마감하기\n");
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("1번입력");
				
				for(int i=0; i<arr.length; i++) {
					System.out.println("["+arr[i].food_id+"] "+ arr[i].name + " : " + arr[i].price
							+ " (잔여재고:"+ arr[i].count+")");
				}
				System.out.println();
				continue;
				
				
				
			case 2:
				System.out.println("2번입력");
				
				System.out.println("몇 번 메뉴를 고르시겠습니까: ");
				input_food_id = sc.nextInt();
				
				for(int i=0; i<arr.length; i++) {
					if(arr[i].food_id == input_food_id) {	//고른메뉴 찾음
						arr[i].order();
					} 
				}
				
				input_food_id = 0;
				System.out.println();
				continue;
				
				
			case 3:
				
				System.out.println("3번입력");
				
				System.out.println("추가할 메뉴 번호를 입력하시오: ");
				input_food_id = sc.nextInt();
				
				for(int i=0; i<arr.length; i++) {
					if(arr[i].food_id == input_food_id) {	//고른메뉴 찾음
						System.out.println("재고를 몇 개 추가하시겠습니까?");
						add_count = sc.nextInt();
						
						Invertory(arr[i],add_count);

					} 
				}
				
				
				input_food_id = 0;
				System.out.println();
				continue;
				
				
			case 4:
				System.out.println("4번입력");
				
				//총매출액
				int total = total(tt.cell, gg.cell, ss.cell);

				//원가차감액
				int minus_total = minus_total(arr);

				//영업이익
				SalesInfo(total, minus_total);
				
				
				System.out.println();
				break;
			
			default:
				System.out.println("다시입력하시오");
				continue;
			}
			break;
		}
		System.out.println("영업종료");
	}
	
	//Menu 클래스
	
	String name;
	int food_id;
	int price;
	int count;
	
	int cell = 0;
	
	Menu(String name, int price, int count, int food_id){
		this.name = name;
        this.price = price;
        this.count = count;
        this.food_id = food_id;
	}
	
	void order() {
		this.count--;
		this.cell += this.price;
	}
	
	static int total(int tt_cell, int gg_cell, int ss_cell) {
		
		return tt_cell + gg_cell + ss_cell;
		
	}
	
	static int minus_total(Menu[] arr) {
		int minus_total =0;
		for(int i=0; i<arr.length; i++) {
			minus_total += arr[i].count*arr[i].price*0.3;
		}
		return minus_total;
	}
	
	static void Invertory(Menu food,int add_count) {

		food.count += add_count;
		
		System.out.println("재고 조정 적용");
		System.out.println(food.name + " : " +food.price +"원 "
				+ "(잔여재고:"+food.count+")");
		
	
	}
	
	static void SalesInfo(int total, int minus_total) {
		System.out.println("총매출액: " + total);
		System.out.println("원가차감액: "+ minus_total);
		System.out.println("총매출액: " + (total - minus_total));
	}
	
}






class Tteokbokki extends Menu{
	Tteokbokki(String name, int price, int count, int food_id){
		super(name, price, count, food_id);
	}

	
}

class Gimbab extends Menu{
	Gimbab(String name, int price, int count, int food_id){
		super(name, price, count, food_id);
	}
}

class Sundae extends Menu{
	Sundae(String name, int price, int count, int food_id){
		super(name, price, count, food_id);
	}
}
