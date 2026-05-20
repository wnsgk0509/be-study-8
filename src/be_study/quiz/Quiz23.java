package be_study.quiz;

import java.util.Scanner;

public class Quiz23 {
	public static void main(String[]args) {
		
		int[] people; //사람 무게
		int[] all = new int[100];
		int[] ele;
		
		int floor;
		int temp=0;
		int stop;
		
		
		int max_kg;
		int max_people;
		int sum_kg=0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("최대 무게: ");
		max_kg=sc.nextInt();
		
		System.out.print("정원: ");
		max_people=sc.nextInt();

		System.out.print("멈출 수 있는 횟수: ");
		stop = sc.nextInt();

		System.out.print("타려고 하는 인원: ");
		
		//타려고 하는 인원
		int count_people = (int)(Math.random()*30)+1;
		System.out.println(count_people);
		
		people = new int[count_people];

		//각 인원에 몸무게 부여
		for(int i=0; i<people.length; i++) {

			people[i] = (int)(Math.random()*111)+40;		
			System.out.println((i+1)+"번 "+people[i]+"kg");
		}
		
		
		//몸무게 분기처리
		int count_kg=0;
		
		for(int i=0; i<people.length; i++) {

			if(sum_kg+people[i] > max_kg) {
				break;
			}else {
				sum_kg += people[i];
				count_kg++;
			}
		}
		
		
		//실제 엘리베이터 탄 인원
		int actual_count = 0; // 실제로 탄 인원을 셀 변수

		for(int i = 0; i < people.length; i++) {
		    
		    // 1번 조건: 이미 정원이 꽉 찼다면 더 이상 태우지 않음
		    if(actual_count >= max_people) {
		        break;
		    }
		    
		    // 2번 조건: 이번 사람을 태웠을 때 최대 무게를 초과하면 태우지 않음
		    if(sum_kg + people[i] > max_kg) {
		        break;
		    }
		    
		    // 두 조건 모두 통과했다면 탑
		    sum_kg += people[i]; // 무게 누적
		    actual_count++;      // 탄 인원 1명 증가
		}

		// 탑승이 끝난 후, 실제로 탄 인원수만큼만 엘리베이터 배열 생성
		ele = new int[actual_count];
		
		System.out.println("탄 인원:"+ele.length);
		System.out.println("무게 합: "+sum_kg);
		
		//층수 입력받기
		for(int f=0; f<ele.length; f++) {
			floor = (int)(Math.random()*all.length)+2;
			ele[f] = floor;
		}
		
		//충수정렬(중복처리 x)
		for(int f1=0; f1<ele.length; f1++) {
			for(int f2=f1+1; f2<ele.length; f2++) {
				if(ele[f1]>ele[f2]) {
					temp = ele[f1];
					ele[f1] = ele[f2];
					ele[f2] = temp;
				}
			}
		}
		

	
		for(int i=0; i<ele.length; i++) {
			for(int j=0; j<all.length; j++) {
				if(ele[i]==j) {
					all[j-1]=j;
				}
			}
		}
		
		
		//사용자가 누른곳에서 내리기 + 횟수제한 시 점검 중 표시후 출력 정지
		for(int i=0; i<all.length; i++) {
			System.out.println(i+1);
			if(i+1 == all[i]) {
				System.out.println("내리겠습니다");
				stop--;
				if(stop==0) {	
					System.out.println("점검 중" );
					break;
				}

			}
		}
		
		if(stop!=0) {	//100층까지 갔을경우
			System.out.println("------------------");
			
			for(int j=all.length; j>0; j--) {
				System.out.println(j);
			}
		}

		
		
		
		
		
	}
}
