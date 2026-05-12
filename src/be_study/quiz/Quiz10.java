package be_study.quiz;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int korea, math, english, score;
		double avg;
		
		
		
		System.out.print("국어점수 : ");
		korea = sc.nextInt();
		System.out.print("수학점수 : ");
		math = sc.nextInt();
		System.out.print("영어점수 : ");
		english = sc.nextInt();
		
		score = korea + math + english;
		avg = score/3;
		
		if((korea >= 40 && math >= 40 && english >= 40) && (avg >= 60.0 )) {
			System.out.println("국어 :"+korea);
			System.out.println("수학 :"+math);
			System.out.println("영어 :"+english);
			System.out.println("합계 :"+score);
			System.out.println("평균 :"+avg);
			System.out.println("축하합니다. 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}
}
