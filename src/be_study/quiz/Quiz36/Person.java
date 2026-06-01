package be_study.quiz.Quiz36;

class Person {
	String name;
	int age;
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
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
	
	Person oldPerson(Person[] pArr) {
		int max = 0;
		for(int i=1; i<pArr.length; i++) {
			if(pArr[i].age > pArr[max].age) {
				max = i;
			}
		}
		return pArr[max];
	}
	
	static Person[] addArr(int num) {
		return new Person[num];
	}
	
	static int sumAge(Person[] pArr) {
		int sum=0;
		for(int i=0; i<pArr.length; i++) {
			sum += pArr[i].age;
		}
		return sum;
	}
	
	static void tenAge(Person[] pArr) {
		for(int i=0; i<pArr.length; i++) {
			pArr[i].age = 10;
		}
	}
	
	static String[] name(Person[] pArr) {
		String[] strArr = new String[pArr.length];
		for(int i=0; i<strArr.length; i++) {
			strArr[i] = pArr[i].name;
		}
		return strArr;
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
		
		
		Person p3 = new Person();
		p3.age = 44;
		p3.name = "노인";
		
		Person[] pArr = {p1, p2, p3};
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i].name);
		}

		for(Person p : pArr) {
			p.hello();
		}
		
		Person oldPerson =new Person();
		oldPerson = oldPerson.oldPerson(pArr);
		System.out.println("나이대장: "+oldPerson.name +"/" +oldPerson.age);
		
		Person[] pArr2 = addArr(5);
		System.out.println( "배열길이: "+pArr2.length);
		
		int sumAge = sumAge(pArr);
		System.out.println("나이합산: "+sumAge);
		
		tenAge(pArr);
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i].age);
		}
		
		String[] str = name(pArr);
		
		pArr[0] = new Person("체인지",62);
		
		System.out.println(pArr[0].name);
		
		
		
		
	}
}