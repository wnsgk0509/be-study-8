package be_study.quiz;

import java.util.Scanner;

public class Quiz15 {
	public static void main(String[]args) {

		String[] arr = {"입력", "수정", "조회", "삭제", "종료" };
		for(int i=0; i<5; i++) {
			System.out.println(i+1 + ". " + arr[i]);
		}
		
		while(true) {
			System.out.print("  메뉴 번호를 입력하세요 : ");
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			if(num >5)
				System.out.println("  잘못 입력하셨습니다.");
			else if(num ==5) {
				System.out.println("  프로그램이 종료됩니다.");
				break;
				}
				
			else
				System.out.println("  "+arr[num-1] + " 메뉴입니다.");
		}
	}
}
