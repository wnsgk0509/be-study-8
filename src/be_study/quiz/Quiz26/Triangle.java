package be_study.quiz.Quiz26;

public class Triangle {
	
	double num1, num2;
	
	Triangle(){}
	
	void setSize(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
	double getArea(){
		return num1*num2/2;
	}
}
