package be_study.cls.cls04;

public class IPad {


		// TODO Auto-generated method stub

		//필드
		String owner; //소유자 정보
		
		//생성자
		IPad(){
			
		}
		IPad(String owner){
			this.owner = owner;
		}
		
		
		//메소드
		int batteryNum() {
			return 80;
		}
		
		void showInfo() {
			System.out.println("IPad 정보 출력 ===");
			System.out.println(owner +  "님의 아이패드 입니다.");
			System.out.println("배터리 잔여량 : "+ batteryNum());
		}
		
		void returnCheck() {
			
			System.out.println("retuernCheck 1");
			for(int i=1; i<=10; i++) {
				System.out.println(i);
				
				if(i==5)
					return;
//					break;
			}

			System.out.println("retuernCheck 2");
			for(int i=1; i<=10; i++) {
				System.out.println(i);
			}
		}
	

}
