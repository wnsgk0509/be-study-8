package be_study.quiz;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[]args) {
		System.out.print("년도를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year%4==0)&&(year%400==0) || !(year%100==0)) 
			System.out.println("윤년이다");
		else
			System.out.println("윤년이 아니다");
	}
}
