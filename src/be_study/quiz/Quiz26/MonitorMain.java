package be_study.quiz.Quiz26;

public class MonitorMain {
	public static void main(String[]args) {
		Monitor m1 = new Monitor("삼성",27,150000,"검은색");
		Monitor m2 = new Monitor("LG", 32, 330000);
		
		m1.setXY("1080 * 780");
		m2.setXY("4096 * 2048");
		m2.setColor("흰색");
		
		
		m1.MonitorInfo();
		m2.MonitorInfo();
		
		System.out.println();
		
		m2.raisPrice(70000);
		
		m1.MonitorInfo();
		m2.MonitorInfo();
		
	}
}
