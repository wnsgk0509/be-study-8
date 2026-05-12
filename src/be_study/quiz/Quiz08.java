package be_study.quiz;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출생년도를 입력하세요 : ");
		int year = sc.nextInt();
		
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		int age = 2027-year;
		
		String info;
		if(year<2000) {
			switch(num) {
			case 1:
				info = "남자입니다.";
				break;
			case 2:
				info = "여자입니다.";
				break;
			default:
				info = "잘못된 입력입니다.";
				
			}
			
		}else if(year>=2000 && year<=2026) {
			switch(num) {
			case 3:
				info = "남자입니다.";
				break;
			case 4:
				info = "여자입니다.";
				break;
			default:
				info = "잘못된 입력입니다.";
			}
		}else
			info = "잘못된 입력입니다.";
		
		if(info.equals("잘못된 입력입니다.")) {
			System.out.println(info);
		}else
			System.out.printf("결과 : %d살 %s",age, info);
		
		
		
	}
}

