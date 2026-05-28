package be_study.quiz.Quiz34;

public class Trash {
	double liter;
	String color;
	double state;


	
	public void trashState() {
		System.out.printf("%.2f%찼습니다\n", state / liter);
	}
	public double trashThrow(double trash) {
		state += trash;
		return state;
	}
	public double trashClear() {
		state = 0;
		System.out.println("쓰레기통을 비웠습니다");
		return state;
	}
	public void trashOpen() {
		System.out.println("쓰게기통을 엽니다");
	}
	public void trashClose() {
		System.out.println("쓰레기통을 닫습니다");
	}
	
	
}
