package be_study.quiz;

public class Quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		i=0;
		j=0;
		//1-1번
		for(i=0;i<25;i++) {
			j= i % 5;
			System.out.print(j+1);
			if(j==4){
				System.out.println();
			}
		}
		
		
		
		
		
		System.out.println("=====================\n");
		//1-2번
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		System.out.println("=====================\n");
		//2-1번
		for(i=1;i<=5;i++) {
			System.out.print(i);
			System.out.print(i);
			System.out.print(i);
			System.out.print(i);
			System.out.println(i);
		}
		
		System.out.println("=====================\n");
		//2-2번
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++){
				System.out.print(i);
			}
			System.out.println();
		}
		
		
	}

}
