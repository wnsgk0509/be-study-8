package be_study.inter.inter01;

public interface TempInterface {
	//변수 선언 -> 상수로 인식
	int SUCESS = 20;	//성공 상수코드
	static final int FAIL = 500; //실패값 상수코드
	//개별 인스턴스 객체에 있는 멤버 변수가 되지 않는다
	
	public void method1();
}
