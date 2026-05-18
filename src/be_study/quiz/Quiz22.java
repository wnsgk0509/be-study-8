package be_study.quiz;

import java.util.Scanner;

public class Quiz22 {
	public static void main(String[]args) {
		final int student = 10;
		Scanner sc = new Scanner(System.in);
		
		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
		int temp=0;
		int sum=0;
		int count=0;
		
		
		for(int i=0; i<scores.length; i++) {
			for(int j=i+1; j<scores.length;j++) {
				if(scores[i]>scores[j]) {
					temp= scores[j];
					scores[j]=scores[i];
					scores[i]=temp;
					
					temp=0;
					
				}
			}
			sum += scores[i];
			if(scores[i]>=80) {
				count++;
			}
		}
		
		System.out.printf("최고 점수: %d \n",scores[scores.length-1]);
		System.out.printf("최저 점수: %d \n",scores[0]);
	
		System.out.printf("평균 점수: %.1f \n",(double)sum/scores.length);
		System.out.printf("80점 이상 학생 수:%d",count);
	
		
	}
}
