package be_study.quiz.Quiz34;

public class Stove {
	
	int fireCount;
	String brand;
	int price;
	boolean state;
	int temp;
	
	public boolean stateOn(boolean On) {
		return true;
	}
	
	public boolean stateOff(boolean Off) {
		return false;
	}
	
	public void tempUpDown(int temp) {
		this.temp = temp;
		System.out.printf("화력 %d 단계",temp);
	}
	
	public int getFireCount() {
		return fireCount;
	}
	public void setFireCount(int fireCount) {
		this.fireCount = fireCount;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
