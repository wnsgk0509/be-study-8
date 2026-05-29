package be_study.quiz.Quiz35;

class Person {
	String name;
	int age;
	
	void hello() {
		System.out.println(name + " : Hello!");
	}
	
	void objectName(Person p) {
		
		System.out.println(p.name);
	}
	
	static Person objectReturn() {
		Person p =new Person();
		p.name = "김철수";
		p.age = 15;
		return p;
	}
	
	void ageUp(Person p) {
		p.age++;
		
		
	}
	
	
	
	public static void main(String[]agrs) {
		Person p1 = new Person();
		p1.age = 26;
		p1.name = "이준하";
		
		System.out.println(p1.name + "/" +p1.age);
		
		p1.hello();
		
		p1.objectName(p1);
		
		Person p2 = objectReturn();
		System.out.println(p2.name+"/"+p2.age);
		p2.ageUp(p2);
		System.out.println(p2.name+"/"+p2.age);
	}
}