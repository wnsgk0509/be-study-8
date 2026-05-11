package be_study.quiz;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[]args) {
		//1번
		
		Scanner sc =new Scanner(System.in);
		
		int num = sc.nextInt();
	
		if(num<=12) {
			System.out.println("오전입니다.");
			if(num<=6 ) {
				System.out.println("이른 오전입니다");
			} else {
				System.out.println("늦은 오전입니다");
			}
		}
		
		else if(num <= 24) {
			System.out.println("오후입니다.");
			if(num<=18 ) {
				System.out.println("이른 오후입니다");
			} 
			else{
				System.out.println("늦은 오후입니다");
			} 
		}
		else {
			System.out.println("잘못입력했습니다");
		}
		
		
		//2번

		int diceNum = 3;
		
		if(diceNum == 1) 		{System.out.println("1");}
		else if(diceNum == 2) 	{System.out.println("2");}
		else if(diceNum == 3) 	{System.out.println("3");System.out.println("4");System.out.println("5");}
		else if(diceNum == 4) 	{System.out.println("3");System.out.println("4");System.out.println("5");}
		else if(diceNum == 5) 	{System.out.println("5");}
		else					{System.out.println("6");}
		
		
		//3번
		
		String localNum = "031";
		
		switch(localNum) {
		case "031":
			System.out.println("경기도입니다");
			break;
		case "02":
			System.out.println("서울입니다");
			break;
		case "041":
			System.out.println("충남입니다");
			break;
		case "051":
			System.out.println("부산입니다");
			break;
		}
		
		//4번
		
		int score = sc.nextInt();
		
		if(score > 100) System.out.println("점수는 100점을 넘을수 없습니다");
		switch(score) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:
			System.out.println("학점 A");
			break;
			
		case 89:
		case 88:
		case 87:
		case 86:
		case 85:
		case 84:
		case 83:
		case 82:
		case 81:
		case 80:
			System.out.println("학점 B");
			break;
			
		case 79:
		case 78:
		case 77:
		case 76:
		case 75:
		case 74:
		case 73:
		case 72:
		case 71:
		case 70:
			System.out.println("학점 C");
			break;
			
		default:
			System.out.println("학점 F");
		}
		
		//다른방법
		int score10 = score/10;
		
		switch(score10) {
		case 10:
		case 9:
			System.out.println("A 학점");
			break;
		case 8:
			System.out.println("B 학점");
			break;
		case 7:
			System.out.println("C 학점");
			break;
		default:
			System.out.println("F 학점");
			
		}
		
		
	}
}
