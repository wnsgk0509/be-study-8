package be_study.quiz;

public class Quiz04 {
	public static void main(String[]args) {
		
		/*
		 * 1번
		 *x=2 y=3
		 *5
		 *5
		 *x=3 y=4
		 *x=4 y=5
		 *x=8 y=4 z=8
		 *x=10 y=5 z=2
		 *x=20 y=6 z=2
		 *x=10 y=6 z=2
		 *
		 *2번
		 *true
		 *false
		 *false
		 */
		
		int menuPrice = 7000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String result = menuPrice<=6000 ? "훌륭" : menuPrice>6000 && menuPrice<=8000 ? "선방" : menuPrice>8000 && menuPrice<=12000 ? "눈물" : "물로배채우기";
		System.out.println(result);
	}
}
