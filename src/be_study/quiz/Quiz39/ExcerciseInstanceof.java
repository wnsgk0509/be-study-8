package be_study.quiz.Quiz39;

class ExcerciseInstanceof {
	public static void main(String[] args) {
		
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++)
			Robot.action(arr[i]);
	} // main


}
class Robot {
	static void action(Robot robot){
		Robot rb = robot;
		if(rb instanceof DanceRobot) {
			((DanceRobot)rb).dance();
		}else if(rb instanceof SingRobot) {
			((SingRobot)rb).sing();
		}else if(rb instanceof DrawRobot) {
			((DrawRobot)rb).draw();
		}else {
			
		}
	}


}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}