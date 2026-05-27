package be_study.quiz.Quiz30;

public class Computer {
	public static final String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
	
	int os;
	int memory;
	
	Computer(int os, int memory){
		this.os = os;
		this.memory = memory;
	}
	
	public void print() {
		System.out.println("운영체제: "+ osType[os] + ",메인메모리: " + memory);
	}
	
	public static void main (String[]args) {
		
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		
		
		pc.print();
		apple.print();
		galaxy.print();
	}

}
