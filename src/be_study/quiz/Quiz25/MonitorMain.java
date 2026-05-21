package be_study.quiz.Quiz25;

public class MonitorMain {

	public static void main(String[]args) {
		
		Monitor mnt1 = new Monitor(65, "삼성", "더프레임");
		Monitor mnt2 = new Monitor(80, "LG", "올레드");
		
		mnt1.printInfo();
		System.out.println();
		mnt2.printInfo();
		
	}
}
