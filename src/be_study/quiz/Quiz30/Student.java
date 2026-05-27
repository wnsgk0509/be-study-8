package be_study.quiz.Quiz30;

public class Student {

	private String dept;	//학과
	private int id;			//학번
	
	public static void main(String[]args) {
		Student s1 = new Student();
		
		s1.setDept("컴퓨터공학과");
		s1.setId(2061046);
		
		System.out.printf("학과:%s \n학번:%d \n",s1.dept,s1.id);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
