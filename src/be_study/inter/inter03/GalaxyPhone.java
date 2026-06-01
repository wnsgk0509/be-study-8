package be_study.inter.inter03;

public class GalaxyPhone implements Callable, Connectable{

	int callStatus; // 전화 상태변수
	
	public void call() {
		System.out.println("GalaxyPhone call()");
		//기능
		//callStatus = 1;
		callStatus = Callable.CALL_ON;
	}
	
	public void connect() {
		System.out.println("GalaxyPhone connect()");
	}
}
