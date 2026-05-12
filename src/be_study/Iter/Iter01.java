package be_study.Iter;

public class Iter01 {
	public static void main(String[]args) {
		
		//반복문 Iteration
		
		
		System.out.println("배고프다");
		//...
		//...
		//...
		//...
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
	
		
		// for문 반복문
		
		/*
		 
		  for(초기화식; 조건식; 증감식){
		  	실행문
		  }
		
		 */
		for(int i=1; i<=10; i++) {
			System.out.println("재밌다");
		}
		System.out.println("for문 끝남");
		
		
		
//		int i=5;
		
		
		/*
		if(i<=10) {
			System.out.println("재밌다");
			i++
		}
		if(i<=10) {
			System.out.println("재밌다");
			i++
		}
		if(i<=10) {
			System.out.println("재밌다");
			i++
		}
		if(i<=10) {
			System.out.println("재밌다");
			i++
		}
		if(i<=10) {
			System.out.println("재밌다");
			i++
		}
		if(i<=10) {
			System.out.println("재밌다");
			i++
		}
		if(i<=10) {
			System.out.println("재밌다");
			i++
		}
		if(i<=10) {
			System.out.println("재밌다");
			i++
		}
		if(i<=10) {
			System.out.println("재밌다");
			i++
		}
		
		
		// i: 11
		/// 
		if( i<=10) {	//거짓!
			System.out.println("재밌다");
		}
		반복문 끝.
		그 반복문 끝난 다음 줄ㅇ 있는 코드 순서대로 또 진행
		*/
		
		int i=0;
		
		// i=1
		for(i=1; i<3; i++) {
			System.out.println("피곤하다");
		}
		
		// i: 35 36 37 38 39 40 41 42 43 44
		for(i=35; i<45; i++) {	// i=i+1) { 10번 반복
			System.out.println("for 실행문");
		}
		
		System.out.println(i);
	}
}
