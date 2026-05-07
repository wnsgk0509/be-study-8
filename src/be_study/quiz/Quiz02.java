package be_study.quiz;

public class Quiz02 {
	public static void main(String[]args) {
		//1번
		String brand, name, serial;
		int price;
		brand = "로지텍";
		name = "mx keys";
		serial = "332L1545K";
		price = 135000;
		
		//2번
		String vendor,  color; 
		int size;
		Boolean isPort, isSound;
		
		vendor = "SAMSUNG";
		size = 24;
		color = "black";
		isPort = true;
		isSound = false;
		
		//3번
		double pi;
		pi = 3.14;
		System.out.println("원주율 : "+ pi);
		
		//4번
		String mathScore = "85";
		String englishScore = "90";
		String artScore = "70";
		
		int math, english, art, sum;
		math = Integer.parseInt(mathScore);
		english = Integer.parseInt(englishScore);
		art = Integer.parseInt(artScore);
		
		sum = math + english + art;
		
		System.out.println(sum);
		
		//5번
		int num1 = 4;
		int num2 = 10;
		double num3 = (double)num1 / num2 ; //num1 을 int->double 로 형변환
		System.out.println( num3 );
	}
}
