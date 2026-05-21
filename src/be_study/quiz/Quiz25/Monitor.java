package be_study.quiz.Quiz25;

public class Monitor {
	
	int inc;
	String vendor;
	String name;
	
	Monitor(){}
	Monitor(int inc, String vendor, String name){
		this.inc = inc;
		this.vendor = vendor;
		this.name = name;
	}
	
	void printInfo() {
		
		System.out.print("제조사 :"+vendor);
		System.out.print( "모델명 : "+name);
		System.out.print(" 인치 :"+inc+"인치");
		
	}
}
