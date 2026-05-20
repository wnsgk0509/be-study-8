package be_study.quiz.Quiz24;

public class Person {
	String name;
	String sex;
	int age;
	double height;
	double weight;
	String job;
	char blood;
	String health;
	boolean isSleep;
	
	Person(String name,String sex, int age, double height, double weight, String job,char blood, String health,boolean isSleep){
		System.out.println("이름은 "+name);
		System.out.println("성별은 "+sex);
		System.out.println("나이는 "+age);
		System.out.println("키는 "+height);
		System.out.println("몸무게는 "+weight);
		System.out.println("직업은 "+job);
		System.out.println("혈행형은 "+blood);
		System.out.println("건강상태는 "+health);
		System.out.println("자는중인가? "+isSleep);

	}
}
