package be_study.inter.inter01;

public class TempObject implements TempInterface, TempInterface2{
				//인터페이스 다중구현
	
	@Override
	public void method1() {
		
		//재정의 함수
		System.out.println("method1()");
	}
	
	public void method99() {
		System.out.println("method99()");
	}
	
	public void method2() {
		System.out.println("method2()");
	}
	
	public void method3() {
		System.out.println("method3()");
	}
}
