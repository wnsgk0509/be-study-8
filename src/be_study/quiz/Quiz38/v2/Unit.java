package be_study.quiz.Quiz38.v2;

public abstract class Unit {
	//추상클래스화
	//Unit 이라는 객체를 생성하면 어색.
	int x,y;
	abstract void move(int x, int y);
	
	void stop() {
		System.out.println("현재위치 ("+x + "," + y + ") 에서 멈춘다");
	}


	public static void main(String[]args) {
		
		Marine u1 = new Marine();
		Tank u2 = new Tank();
		Dropship u3 = new Dropship();
		
		Unit[] arr  = {u1, u2, u3};
		
		for(Unit u : arr) {
			u.move(10, 20);
			u.stop();
		}
		
		u1.stimPack();
		u2.changeMode();
		u3.load();
		u3.unload();
		
		
		
	}
	
	static class Marine extends Unit{ // 보병
//		int x, y; // 현재 위치
		void move(int x, int y) {
			super.x += x;
			super.y += y;
			System.out.println("x:"+x+" y:"+y+" 만큼 걷는다");
		} //지정된 위치로 이동
		
//		void stop() {
//				/* */
//		} //현재 위치에 정지
		void stimPack() {
			System.out.println("스팀팩을 사용한다");
		} //스팀팩을 사용한다
	}
	
	static class Tank extends Unit{ // 탱크
		
//		int x, y; // 현재 위치
		void move(int x, int y) { 
			super.x += x;
			super.y += y;
			System.out.println("x:"+x+" y:"+y+" 만큼 바퀴를 구른다");
		} //지정된 위치로 이동
		
//		void stop() {
//			/* */ 
//		} //현재 위치에 정지
		
		void changeMode() { 
			System.out.println("공격모드를 변환한다");
		} //공격모드를 변환한다
	}
	
	static class Dropship extends Unit{ // 수송선
		
//		int x, y; // 현재 위치
		void move(int x, int y) {
			super.x += x;
			super.y += y;
			System.out.println("x:"+x+" y:"+y+" 만큼 날아간다");
		} //지정된 위치로 이동
		
//		void stop() { 
//			/* */ 
//			} //현재 위치에 정지
		
		void load() { /* .*/
			
		} //선택된 대상을 태운다
		
		void unload() {
			/* .*/ 
		} //선택된 대상을 내린다
	}
	
}
