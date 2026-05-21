package be_study.quiz.Quiz26;

public class Rectangle {
	double num1;
	double num2;
	
	Rectangle(){}
	
	Rectangle(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	double getArea() {
		
		return num1 * num2;
		
	}
}
