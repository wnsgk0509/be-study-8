package be_study.cls.cls05;

import java.util.Scanner;

public class GalaxyMain {

	public static void main(String[]args) {
		
		// static 은 클래스명.변수명 접근 바로 가능
		System.out.println("정적멤버 : " + Galaxy.madeBy);
//		System.out.println(Galaxy.owner);	인스턴스 멤버 변수
		Galaxy.showMadeBy(); //정적 메소드 호출
		
		Galaxy g1 = new Galaxy();	//인스턴스 객체 생성
		g1.owner = "이회장";
		g1.model = "갤럭시S26울트라";
		
		g1.showInfo();
		System.out.println(g1.madeBy);		//권장x
		System.out.println(Galaxy.madeBy);	//권장 (클래스명으로 접근)
		g1.showMadeBy();	//권장x
		Galaxy.showMadeBy();//권장

		Galaxy g2 = new Galaxy();	//인스턴스 객체 생성
		g2.owner = "김부장";
		g2.model = "갤럭시Z플립10";

		g2.showInfo();
		System.out.println(g2.madeBy);		//권장x (멤버변수가 따로 있나? 라는 의문을 가지게 됨)
		System.out.println(Galaxy.madeBy);	//권장 (클래스명으로 접근)
		g2.showMadeBy();	//권장x
		Galaxy.showMadeBy();//권장
		
		System.out.println(Math.random());
		// String.valueOf()
		// Integer.parseInt()
		
		Scanner scanner = new Scanner(System.in);
//		scanner.nextInt();
		
		System.out.println(3*3* 3.14);
		System.out.println(3*3* Math.PI);


		
	}
}
