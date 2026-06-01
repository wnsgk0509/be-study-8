package be_study.quiz.QuizPerson;

public class ArrayPractice {
	
	double avg(int[] num) {
		double sum2=0;
		for(int i=0; i<num.length; i++) {
			sum2 += num[i];
		}
		return sum2/num.length;
		
	
	}
	
	int max(int[] num) {
		int max=0;
		for(int i=1; i<num.length; i++) {
			if(num[i]>num[max]) {
				max = i;
			}
		}
		
		return num[max];
	}

	int[] itemUp(int[] num) {
		for(int i=0; i<num.length; i++) {
			num[i] = num[i]+1;
		}
		return num;
	}
	
	int[] makeArr(int num) {
		int[] arr = new int[num]; 
		
		return arr;
	}
	
	int[] reverseArr(int[] arr) {
		int tempArr[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			tempArr[i] = arr[arr.length-i-1];
		}
		return tempArr;
	}
	
	
	
	
	
	
	
	public static void main(String[]args) {
		
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		arr[2] = 50;
		System.out.println(arr.length);
		System.out.println();
		
		int sum=0;
		for(int i=0; i<arr.length;  i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		System.out.println();
		
		ArrayPractice ap = new ArrayPractice();
		System.out.println(ap.avg(arr));
		System.out.println();
		
		System.out.println(ap.max(arr));
		System.out.println();
		
		ap.itemUp(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		ap.reverseArr(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		


	}
}
