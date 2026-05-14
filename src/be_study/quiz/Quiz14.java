package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[]args) {
		//1번
		Scanner sc = new Scanner(System.in);
		
		int[] arr=  new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.print("몇번째 수인가요?");
		int num= sc.nextInt();
		System.out.printf("결과 : %d",arr[num-1]);
		System.out.println();
		
		//2번
		int[] arr2= new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.print("결과");
		for(int j=4; j>=0; j--) {
			System.out.print( arr[j]+" ");
		}
		
	
		System.out.println();
		//3번
		int num3 =1;
		int[][] arr3 = new int[4][4];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				arr3[i][j]=num3;
				++num3;
				
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
