package be_study.var;

import java.util.Scanner;

public class Variable06 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = 10;
		
		// 기본타입 값이 같은가? 비교하는 연산자 ==
		// == 비교 -> 결과 -> 논리형 (T/F)
		
		boolean n1 = num1 == num2;
		System.out.println(n1);
		
		sc.nextLine(); //앞에 남은 입력 청소
		
		String str1 = sc.nextLine();
		String str2 = "커피";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		// 문자열(String) 값 비교할때는 == 으로 인식안됨. -> .equals() 기능 사용
		
	}
}
