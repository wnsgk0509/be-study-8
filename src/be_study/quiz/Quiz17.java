package be_study.quiz;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[]args) {
		
		//1번
		int x, y;
		
		for(x=1;x<=5;x++) {
			for(y=1;y<=5;y++) {
				if(x+2*y==5) {
					System.out.println("("+x+ ","+y+")");
				}
			}
		}
		
		
		//2번
		Scanner sc= new Scanner(System.in);
		int num1, num2;
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		else if(num1<num2) {
			System.out.println(num2+"-"+num1+"="+(num2-num1));
		}
		else {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		
		//3번

		int[] arrY= new int[4];
		int count=0;
		
		
		System.out.print("입력 ");
		for(int i=0; i<arrY.length; i++) {
			arrY[i]= sc.nextInt();
			if(arrY[i]==1) {
				count++;
			}else if(arrY[i]>1) {
				System.out.println("잘못된 입력입니다");
				count = 5;
				break;
			}
		}
		System.out.print("결과 ");
		switch(count) {
		case 0:
			System.out.println("모");
			break;
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");
			break;
		case 5:
			System.out.println("다시 입력하시오");
			break;
		}
		
		int star;
		star = sc.nextInt();
		for(int i=0;i<star;i++) {
			System.out.print("*");
		}
	}
}
