package be_study.quiz;

import java.util.Scanner;

public class Quiz13 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//1번
		int num = sc.nextInt();
		if(num % 2 ==0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		//2번
		int num2 = sc.nextInt();
		if(num2 % 7 ==0)
			System.out.println("7의 배수입니다.");
		else
			System.out.println("아닙니다");
		
		//3번
		int sum3=0;
		for(int i=0; i<=1000; i++) {
			if(i%5==0) {
				sum3 += i;
			}
		}
		System.out.println(sum3);
		
		//4번
		System.out.print("입력 : ");
		int num4 = sc.nextInt();
		if(num4 <=50) {
			for(int i=1; i<=num4; i++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		//5번
		int sum5=0;
		for(int i=1; i<=10; i++) {
			if(i % 2==0) {
				sum5 -= i;
			}else {
				sum5 += i;
			}			
		}
		System.out.println(sum5);
		
		
		//6번
		int sum6=0;
		for(int i=1; true; i++) {
			if(sum6 <1000)
				sum6 += i;
			else
				break;
		}
		System.out.println(sum6);
		
		
		//7번
		System.out.print("입력 : ");
		int num7 = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(num7 + " * " + i + " = " + num7*i);
		}
		
		
	}
}
