package be_study.inter.inter03;

public class Person {

	//사람
	
	// 휴대폰을 소유하고 있음
	
//	IPhone iPhone;
//	LGPhone lgPhone;
//	GalaxyPhone galaxyPhone;
	
	//상속 개념으로 Phone
	//Phone phone;
	
	//인터페이스
	Callable callPhone;
	
	//Callable callPhone = new IPhone();
	//Callable callPhone = new GalaxyPhone();
	//Callable callPhone = new LGPhone();

	
	//사람이 전화를 건다
	public void call(String phoneNumber) {
//		iphone.
//		lgPhone.
		callPhone.call();
	}
	
}
