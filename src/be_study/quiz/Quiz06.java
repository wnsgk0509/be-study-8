package be_study.quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1번
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변 : ");
		double width = sc.nextDouble();
		System.out.print("높이 : ");
		double heigh = sc.nextDouble();
		
		System.out.printf("넓이 : %f\n", width*heigh/2);

		//2번
		System.out.print("윗변 : ");
		double width_H = sc.nextDouble();
		System.out.print("밑변 : ");
		double width_L = sc.nextDouble();
		System.out.print("높이 : ");
		double heigh_2 = sc.nextDouble();
		
		System.out.printf("넓이 : %f\n", (width_L+width_H)*heigh_2/2);
		
		//3번
		int snack = 100;
		int member = 24;
		System.out.printf("인당 : %d\n", snack/member);
		System.out.printf("남는과자 : %d\n", snack%member);
		
		//4번
		System.out.print("세자리 정수 입력:");
		int num = sc.nextInt();
		System.out.printf("백의자리:%d\n",num/100);
		System.out.printf("십의자리:%d\n",num%100/10);
		System.out.printf("일의자리:%d\n",num%10);
		
		//5번
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		
		//x와 y를 바꾼 작업
		int temp =x;
		x=y;
		y=temp;
		
		System.out.println("x="+x+ " y="+y);
	}

}
