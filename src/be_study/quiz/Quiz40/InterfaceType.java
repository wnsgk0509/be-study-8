package be_study.quiz.Quiz40;

//basecode
public class InterfaceType {
	public static void main(String[] args) {
		//객체 생성
		Food food = new Food("족발",19800);
		Electronics ele = new Electronics("에어팟",199000);
		Clothing clo = new Clothing("셔츠",49900);
		
		//총합 계산
		
//		food.discountedPrice();
//		ele.discountedPrice();
//		clo.discountedPrice();
		
		int total = food.discountedPrice() + ele.discountedPrice() + clo.discountedPrice();
		
		
		//결과 출력
		System.out.println("총합: "+total+"원");
	}
}

interface Orderable {
	public int discountedPrice();
}

class Food implements Orderable {
	private String name;
	private int price;
	

	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */
	public int discountedPrice() {
		price = (int) (price*0.9);
		return price;
	}
}

class Electronics implements Orderable {
	private String name;
	private int price;
	

	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}
/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */
	public int discountedPrice() {
		price = (int) (price*0.8);
		return price;
	}
}

class Clothing implements Orderable {
	private String name;
	private int price;
	

	
	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */
	public int discountedPrice() {
		price = (int) (price*0.7);
		return price;
	}
}

