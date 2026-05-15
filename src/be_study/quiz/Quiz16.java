package be_study.quiz;

public class Quiz16 {
	public static void main(String[]args) {
		
//		int[] arr = new int[25];
//		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				if(i==j) {
//					System.out.print("1");
//				}
//				else if(i<j) {
//					System.out.print("2");
//				}
//				else {
//					System.out.print("3");
//				}
//			}
//			
//			System.out.println();
//		}
		
		int[][] arr = new int[5][5];
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(i==j) {
					System.out.print("1");
				}else if(i<j) {
					System.out.print("2");
				}else {
					System.out.print("3");
				}
				
			}
			System.out.println();
		}
	}
}
