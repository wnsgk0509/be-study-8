package be_study.var;

public class Variable01 {
	
	public static void main(String[]args) {
		
		// 변수 선언
		
		// 타입 변수명
		// int 타입 : 정수형 숫자 타입 (1,2,3,...)
		int abc;	// 변수 선언
		int def; 	// 정수형 숫자 타입의 변수 선언
		
		int point; //선언
		int score; 
		
//		int x;
//		int y;
//		int z;
		
		int x, y, z; //int(정수ㅕㅇ)타입의 변소 x y z 3개 동시에 선언
		
		score = 90;	// score 라는 이름의 변수에 90이란 값을 저장

		int math = 99; // math 변수 선언과 동시에 + 값 저장 -> 초기화
		
//		level = 50;	//선언하지 않은 변수명은 사용 불가
		int level;	//언한 변수
		level = 50; //변수 선언 이후 라인에서 사용
	
		int time; //선언
		time = 12;	//12 값 저장
		time = 13;	//13 값 저장
		
		int myTime = 10 
				+ 5 -2;
		System.out.println(myTime);
		
		myTime = time + 5;
		System.out.println(myTime);
		
		
		time = 15;
		myTime = time + 4 + time - 2 + time;
		System.out.println(myTime);
		
//		int value;		//변수 선언만! 값이 아직 없음
//		int result = value + 5;	//초기안된 value 는 값ㅌ + 5 연산 불가
		
		int value = 20;
		int result = value + 5;
		
		int temp; //선언만
		// 출력
		System.out.println(1293858);
		System.out.println("문자출력");
		System.out.println(value);
		System.out.println(result);
//		System.out.println(temp);	//초기화되지 않은 변수 출력 xS
		
		System.out.println(result + 50);
		
		System.out.println( result + value + result + value);
		
		int totalScore = score + score + 50;
		System.out.println(totalScore);
		
		System.out.println(totalScore + 30);
		
		totalScore = totalScore  + 70;
		
		System.out.println(totalScore);	//300
		
		//***
		int a = 10;
		int b = 20;
		
		System.out.println(a);
		System.out.println(b);
		
		//값 바꾸기
		// a : 10	b : 20
		// a : 20	b : 10
		
//		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
		
	}
}
