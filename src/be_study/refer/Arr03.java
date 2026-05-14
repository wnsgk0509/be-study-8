package be_study.refer;

public class Arr03 {
	public static void main(String[]args) {
		
		int[] arr1 = {1,2,3};
		
		//		ㅁ ㅁ ㅁ
		//		1  2 3 
		//index	0  1 2
		
		// arr[0] <-- int 타입변수
		
		System.out.println( arr1[0] == arr1[0]); //true
		System.out.println( arr1[0] == arr1[2]); //false
		
		String[] arr2 = {"A", "B", "A"};		//arr2[0] 할당할때 "A" 를 참조했기 때문에 arr2[2] 실행시 "A"는 이미 생성되어 있어서 재사용한다

		System.out.println( arr2[0] == arr2[0]); //true
		System.out.println( arr2[0] == arr2[2]); //true

		
		String[][] arr3 = { {"A", "B", "C" }, {"D", "E" , "F"} };
		
		//				A B C
		//				D E F
		
		System.out.println(arr3.length);
		System.out.println(arr3[0].length);
		
		System.out.println( arr3[0] == arr3[1]);		//주소비교
		System.out.println( arr3[0][0] == arr3[1][1]);	//주소비교
		System.out.println( arr3[0][0].equals(arr3[1][1]) );	//값비교
		
		int[][] arr4 = {{1,2,3}, {4,5,6}};
		System.out.println(arr4[0] == arr4[1]);			//주소비교
		System.out.println(arr4[0][0] == arr4[1][1]);	//값 비교 int  기본타입
		
		
		
	}
}
