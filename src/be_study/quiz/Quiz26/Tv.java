package be_study.quiz.Quiz26;

public class Tv {
	String name;
	int year;
	int inc;
	
	Tv(){}
	Tv(String name, int year, int inc){
		this.name = name;
		this.year = year;
		this.inc = inc;
	}
	void show() {
		System.out.println(name + "제품 "+ year+"년형 "+inc+"인치 TV");
	}
}
