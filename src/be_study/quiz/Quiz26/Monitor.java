package be_study.quiz.Quiz26;

public class Monitor {

	String vendor, color, xy;
	int inc, price;
	
	
	Monitor(){}
	Monitor(String vendor, int inc, int price){
		this.vendor = vendor;
		this.inc = inc;
		this.price = price;
		
	}
	Monitor(String vendor, int inc, int price, String color){
		this.vendor = vendor;
		this.inc = inc;
		this.price = price;
		this.color = color;
		
	}
	void setXY(String xy) {
		this.xy = xy;
	}
	void setColor(String color) {
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원이 켜졌습니다");
		
	}
	int raisPrice(int money) {
		this.price += money;
		return this.price;
		
	}
	void MonitorInfo() {
		System.out.println(vendor+"회사" + " 인치: "+inc+" 가격: "+price+" 색상: "+color+" 해상도: "+xy);
	}
}
