package be_study.quiz.Quiz34;

public class Refrigerator {

	String brand;
	int liter;
	boolean p_switch;
	int temperature;	// 현재 온도 (상태변수)
	
	int door;
	
	public void switchFunc(boolean state) {
		if(state == true) {
			System.out.println("전원이 켜졌습니다");
		}else {
			System.out.println("전원이 껴졌습니다");
		}
	}
	
	public void tempUp(int u) {
		this.temperature += u;
	}
	public void tempDown(int d) {
		this.temperature -= d;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getLiter() {
		return liter;
	}
	public void setLiter(int liter) {
		this.liter = liter;
	}
	public boolean isP_switch() {
		return p_switch;
	}
	public void setP_switch(boolean p_switch) {
		this.p_switch = p_switch;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	
}
