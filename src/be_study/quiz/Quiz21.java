package be_study.quiz;

import java.util.Scanner;

public class Quiz21 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//1번
		int[] x = new int[6];
		int[] y = new int[6];
		
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<y.length; j++) {
				x[i]=i+1;
				y[j]=j+1;
				
				if(x[i]+y[j] == 6) {
					System.out.println(x[i] + " " + y[j]);
				}
			}
		}
		
		
		
		System.out.println();
		//2번
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			
			lotto[i] = (int)(Math.random()*45)+1;
			
			for(int j=0; j<i; j++) {
				
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}

		}
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+ " ");
		}
		
		
		System.out.println();
		//3번
		
		int[][] gradeArr = new int[3][5];
		int[] classSum = new int[3];
		
		for(int i=0; i<gradeArr.length; i++) {
			System.out.printf("%d반 : ", i+1);
			
			for(int j=0; j<gradeArr[i].length; j++) {
				gradeArr[i][j] = sc.nextInt();
				classSum[i] += gradeArr[i][j];
				
			}
		}
		
		double total=0;
		
		for(int i=0; i<gradeArr.length; i++) {
			System.out.printf("%d반 평균 : %f",i+1,(double)classSum[i]/gradeArr[i].length);
			System.out.println();
			total += classSum[i];
		}
		
		System.out.printf("전체 평균 : %s",(double)total/(gradeArr.length*gradeArr[0].length));
		
		
		System.out.println();
		
		//4번
		int[][] arr =
			{
			{10, 20, 30},
			{20, 30, 40},
			{30, 40, 50}
			};
		
		int[][] arr2 = new int[arr.length+1][arr[0].length+1];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				arr2[i][j] = arr[i][j]; //복제
				
				arr2[i][arr[i].length] += arr[i][j]; 
				
				arr2[arr.length][j] += arr[i][j];
				
				arr2[arr.length][arr[i].length] += arr[i][j];
				
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.printf("%d ",arr2[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
