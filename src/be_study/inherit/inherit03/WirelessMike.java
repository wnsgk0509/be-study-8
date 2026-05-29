package be_study.inherit.inherit03;

public class WirelessMike extends Mike {
	//무선마이크
	//	무선마이크는 마이크다
	
	//type model price
	// volumeUp check 상속받음
	
	//메소드 재정의 (오버라이딩)	*오버로딩은 매서드에 들어오는 매개변수 개수나 타입을 변경한 것이다.
	public void volumeUp() {
		System.out.println("WirelessMike volumeUp() 재정의");
	}
}
