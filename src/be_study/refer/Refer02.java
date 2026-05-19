package be_study.refer;

public class Refer02 {
	
	public static void main(String[]args) {
		
		//enum 열거타입
		
		//선호도 저장
		
		int likePoint = 50; //60; 1~5
		
		String likeLevel = "매우좋음";	//매우나쁨 나쁨 보통 좋음 매우좋음
		
		String likeLevel2 = "많이좋음";
		
		int likeValue = 1;	//1 2 3 4 5
		
		if(likeLevel.equals("매우좋음"));{
			
		}
		
		if(likeValue == 5) {
			
		}
		
		Likeindex li1 = Likeindex.VERYGOOD;
		Likeindex li2 = Likeindex.NORMAL;
		
		if(li1==Likeindex.VERYGOOD) {
			System.out.println("아주 좋은 등급이구나~");
		}else if(li1 == Likeindex.VERYBAD) {
			System.out.println("아누 안좋은데 대응이 필요하겠네~");
		}else {
			
		}
		Week w1 = Week.TUE;
		Week w2 = Week.FRI;
		
		if(w2 == Week.FRI) {
			System.out.println("금요일은 신나는 날");
		}
				
		//참조변수 배열 복사, 향상된 for문, enum(열거타입)
	}
}
