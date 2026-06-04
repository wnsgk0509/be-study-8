package be_study.quiz.Quiz42v2;

import java.util.Scanner;

public class FoodTruck {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int funNum;
		int input_food_id;
		int input_food_add;
		
		Menu selectMenu = null;
		
		//객체 생성만 넣기
		FoodTruck truck = new FoodTruck();
		
		
		
		
		
		while(true) {
			System.out.print("1.메뉴판보기 ");
			System.out.print("2.주문하기 ");
			System.out.print("3.재고관리 ");
			System.out.print("4.마감하기\n");
			
			funNum = sc.nextInt();
			
			switch(funNum) {
			case 1:	//메뉴판보기
				truck.showMenu();
				continue;
				
			case 2: //주문하기
				System.out.println("2번입력");
				
				System.out.println("몇 번 메뉴를 고르시겠습니까: ");
				input_food_id = sc.nextInt();
				
				selectMenu = truck.findMenu(input_food_id);
				
				if(selectMenu == null) {
					System.out.println("없는 메뉴입니다 다시 골라주세요");
					continue;
				}
				
				if(selectMenu.count <= 0) {
					System.out.println("재료가 소진되었습니다 죄송합니다.");
					continue;
				}
				
				selectMenu.count--;
				truck.sales += selectMenu.price;
				
				input_food_id = 0;
				System.out.println();
				continue;
				
			case 3: //재고관리
				System.out.println("추가할 메뉴 번호를 입력하시오:");
				input_food_id = sc.nextInt();
				selectMenu = truck.findMenu(input_food_id);
				
				if(selectMenu == null) {
					System.out.println("없는 메뉴입니다 다시 골라주세요");
					continue;
				}
				
				System.out.println("추가할 개수 :");
				input_food_add = sc.nextInt();
				selectMenu.count += input_food_add;
				
				System.out.println("==================");
				truck.foodInfo(selectMenu);
				
				
				continue;
			case 4: //마감하기
				truck.damage();
				System.out.println("판금액 :"+truck.sales);
				System.out.println("손해금액 :"+truck.minus);
				System.out.println("순이익 :"+(truck.sales - truck.minus));
				break;
			}
			break;
		}
	}
	int sales;
	int minus;
	
	//FoodTruck클래스
	Menu tt = new Menu("떡볶이",6000,10,1);
	Menu gg = new Menu("김밥",4000,10,2);
	Menu ss = new Menu("순대",7000,10,3);
	
	Menu[] foods = {tt, gg, ss};
	
	
	
	public void showMenu() {
		for(int i=0; i<foods.length; i++) {
			System.out.println("["+foods[i].food_id+"] "+ foods[i].name + " : " + foods[i].price
					+ " (잔여재고:"+ foods[i].count+")");
		}
	}
	
	public void foodInfo(Menu menu) {
		System.out.println("["+ menu.food_id +"] "+ menu.name + " : " + menu.price
				+ " (잔여재고:"+ menu.count+")");
	}
	
	public Menu findMenu(int food_id) {
		for(int i=0; i<foods.length; i++) {
			if(foods[i].food_id == food_id) {	//고른메뉴 찾음
				return foods[i];
			} 
		}
		return null;	//에러발생시켜서 종료
		
	}
	
	public void damage() {
		
		for(int i=0; i<foods.length; i++) {
			minus += (int)(foods[i].count * foods[i].price *0.3);
		}
	}
	
	public void nullMenu() {
		
	}

}

class Menu{
	
	
	String name;
	int price;
	int count;
	int food_id;
	
	Menu(String name, int price, int count, int food_id){
		this.name = name;
		this.price = price;
		this.count = count;
		this.food_id = food_id;
	}
	


	
}

