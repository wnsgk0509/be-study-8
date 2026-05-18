package be_study.quiz;

public class Quiz19 {
	public static void main(String[]args) {
		
		//1번
		int[][] arr1 = new int[4][4];
		int count = 1;
		for(int i=0; i<arr1.length; i++ ) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		
		System.out.println();
		
		//2번
		int[][] arr2 = new int[4][4];
		
		for(int i=0; i<arr2.length; i++ ) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(j*arr2.length+i+1+" ");
			}
			System.out.println();
		}	
		System.out.println();
		
		//3번
		int[][] arr3 = new int[4][4];
		
		for(int i=0; i<arr3.length;i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.print(arr3.length*arr3[i].length-i*4-j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		//4번
		int[][] arr4 = new int[4][4];
		
		for(int i=0; i<arr4.length;i++) {
			for(int j=0; j<arr4[i].length; j++) {
				System.out.print(arr4.length*arr4[i].length-j*4-i+" ");
			}
			System.out.println();
		}
		
	}
}
