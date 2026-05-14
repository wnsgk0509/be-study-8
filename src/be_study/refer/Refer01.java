package be_study.refer;

import java.util.Scanner;

public class Refer01 {

	public static void main(String[] args) {

		
		//기존타입 참조타입
		
		int n;			//값X 기존타입변수
		int num = 0;	//값O 기존타입변수
		
		String s1;		//값X 참조타입변수
		String s2 = null;// 참조하는게 없다! null
				
//		System.out.println(n);
		System.out.println(s2);
		
		Scanner scanner = new Scanner(System.in);
		String t1 = "사과";
		String t2 = "사과";
		String t3 = scanner.nextLine();
		String t4 = new String("사과");
		
		System.out.println(t1 == t2);		//true
		System.out.println(t1.equals(t2));	//true
		
		System.out.println(t1 == t3);		//false
		System.out.println(t1.equals(t3));	//true
		
		System.out.println(t1 == t4);		//false
		System.out.println(t1.equals(t4));	//true
		
		
		System.out.println("---------------------");
		
		String ne = null;
		System.out.println( ne == null);
		
		//boolean b = true false			b == true
		
//		System.out.println( ne.equals("사과"));
		// NullPointerException
		
		// 값 복사
		int n1 = 10;
		int n2 = n1;	//정수형 변수 안에 들어있는 값 복사
		System.out.println(n1);
		System.out.println(n2);
		
		String str1 = "커피";
		String str2 = str1;	// 변수 안에 있는 값 복사
		System.out.println(str1);
		System.out.println(str2);
	}

}
