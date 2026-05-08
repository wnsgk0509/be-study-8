package be_study.quiz;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1-1 번
		int x = 10;
		int y = 4;
		int result1_1 = x/y;
		System.out.println(result1_1);
		
//		result = 0;
		//1-2 번
		double result1_2 = (double)x / y;
		System.out.println(result1_2);
		
		
		//2번
		double a2 = 3.5;
		double b2 = 4.7;
		double result2 = a2 + (int)b2;
		System.out.println(result2);
		
		//3번
		String a3 = "3.4";
		String b3 = "4";
		int result3 = (int)Double.parseDouble(a3) * Integer.parseInt(b3);
		System.out.println(result3);
		
		//4번
		String a4 = "10";
		int b4 = 3;
		double c4 = 4.5;
		String result4 = a4 + (int)(b4 * c4);
		System.out.println(result4);
		
		//5번
		int a5 = 4;
		double b5 = 3.4;
		String c5 = "6.8";
		String result5 = String.valueOf((int)Double.parseDouble(c5)*a5  )+ (int)b5;
		System.out.println(result5);
		
		//6번
		int x6_1 = 111;
		int y6_1 = 13;
		int result6_1 = x6_1 % y6_1;
		System.out.println(result6_1);
		
		int x6_2 = 111;
		int y6_2 = 13;
		int result6_2 = x6_2 / y6_2;
		System.out.println(result6_2);
		
		
		
	}

}
