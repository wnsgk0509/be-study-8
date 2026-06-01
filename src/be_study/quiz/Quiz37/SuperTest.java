package be_study.quiz.Quiz37;

public class SuperTest {
public static void main(String[] args) {
	/* 1. Orc 객체를 만들고 정보를 출력하시오. */
	Orc o1 = new Orc("오크",80);
	System.out.println(o1.toString());

	
	/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
	OrcWarrior ow1 = new OrcWarrior("오크전사", 120, 3);
	System.out.println(ow1.toString());
	
	System.out.println(o1);
	System.out.println(ow1);
	
			
	}
}

class Orc {
	protected String name;
	protected int hp;
	
	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String toString() {
		String str = "Orc { name : " + name + " ,hp : " + hp + " }";
		return str;
	}
}

class OrcWarrior extends Orc{
	protected int amor;
	
	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
	}
	
		// 메소드 오버라이딩!
	public String toString() {
		String str = "OrcWarrior { name : " + name + " ,hp : " + hp + "amor: "+ amor +" }";
		return str;
	}
}