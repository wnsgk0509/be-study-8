package be_study.quiz;

public class Quiz09 {
	public static void main(String[]args) {
		
		//1번
		int i=0;
		for(i=0; i<11; i++) {
			System.out.println(i);
		}
		
		System.out.println("########################");
		i=0;
		
		//2번
		for(i=1; i<=9; i++) {
			System.out.println(i);
		}
		System.out.println("########################");
		i=0;
		
		//3번
		for(i=10; i<=100;i += 10) {
			System.out.println(i);
			
		}
		System.out.println("########################");
		i=0;
		
		//4번
		for(i=25; i<=100;i += 25) {
			System.out.println(i);
		}
		
		
		System.out.println("############]############");
		i=0;
		
		//5번
		i=50;
		while(true) {

			System.out.println(i);
			
			if(i == 55)
				break;
			++i;
		}
		
		System.out.println("########################");
		i=0;
		
		//6번
		i=10;
		while(true) {
			System.out.println(i);
			
			if(i==1) 
				break;
			
			
			--i;
			
		}

		System.out.println("########################");
		i=0;
		
		//7번
		i=30;
		while(true) {
			System.out.println(i);
			
			if(i ==0)
				break;
			
			i -= 5;
		}
		
		System.out.println("########################");
		i=0;
		
		//8번
		i=30;
		while(true) {
			System.out.println(i);
			
			if(i == 5)
				break;
			
			i -= 5;
		}
		
		
		System.out.println("########################");
		i=0;
		
		//9번
		i=25;
		while(true) {
			System.out.println(i);
			
			if(i == 0)
				break;
			
			i -= 5;
		}
		
	}
}
