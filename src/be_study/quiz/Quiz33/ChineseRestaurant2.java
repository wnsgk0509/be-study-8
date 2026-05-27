package be_study.quiz.Quiz33;

import java.util.ArrayList;
import java.util.List;

import be_study.quiz.Quiz33.Menu;
import be_study.quiz.Quiz33.Order;

public class ChineseRestaurant2 {
	public static void main(String[] args) {
		// 주문을 위한 메뉴 선정
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambbong = new Menu("짬뽕", 5900);
		Menu tangsook = new Menu("탕수육", 13900);
		
		// 메뉴를 조합하여 주문을 생성
//		Menu[] menuArr = { jjajang, jjambbong, tangsook };
		List<Menu> menuList = new ArrayList<>();
		menuList.add(jjajang);
		menuList.add(jjambbong);
		menuList.add(tangsook);
		
		Order order = new Order(123, menuList);
		
		// 주문 결과 출력
		System.out.printf("주문 합계: %d원\n", order.totalPrice());
	}
}

	class Order {
		
		// 필드(인스턴스 필드)
		int orderNum;
		List<Menu> menus;
			
		// 생성자
		public Order(int i, List<Menu> list) {
			orderNum = i;
			menus = list;
		}
		
		
		// 메소드(인스턴스 메소드)
		public int totalPrice() {
			int total=0;	
			for(int i=0; i<menus.size(); i++) {
				total += menus.get(i).price;
			}
			
			return total;
		}
	}
	class Menu {
		// 필드
		String name;
		int price;
		
		// 생성자
		public Menu(String str, int i) {
			name = str;
			price = i;
		}
	}					


