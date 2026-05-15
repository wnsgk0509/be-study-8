package be_study.quiz;

import java.util.Scanner;

public class Quiz18 {
	public static void main(String[]args) {
		
		//1번
		for(int i=5; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//2번
		for(int i=0;i<4; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3번
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num%i!=0) {
				continue;
			}else {
				System.out.print(i+" ");
			}

		}
		System.out.println();
		//4번
		int num4;
		System.out.print("입력 ");
		num4 = sc.nextInt();
		int i=0;
		
		
		while(i<num4*2-1) {
			for(int j=0; j<i+1; j++) {
				if(i>(num4*2-1)/2) {
					for(j=i;j<num4*2-1%i;j++) {
						System.out.print("*");
					}
					break;
				}
				System.out.print("*");

				
			}
			i++;

			System.out.println();
		}
		
		//5번
		int sum=0;
	
		for(int j=1; j<=10; j++) {
			if(j%2==0) {
				sum+=(j+1)*(j/2);
				System.out.println(sum);
	
			}else {
				sum+=(j+1)*(j/2)+j/2+1;
				System.out.println(sum);
				
			}
			
		}
		
		System.out.println(sum);

		
		//6번
		
		
	}
}
