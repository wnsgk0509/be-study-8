package be_study.quiz.Quiz30;

import java.util.Scanner;

public class Account {
	private String owner;
	private long balance;
	
	public Account() {
		owner = null;
		balance = 0;
	}
	
	public Account(String owner) {
		this.owner = owner;
		balance = 0;
	}
	
	public Account(long balance) {
		owner = null;
		this.balance = balance;
	}
	
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	//저축
	public long deposit(long amount) {	
		getBalance();
		balance += amount;
		
		return balance;
	}
	
	//인출
	public long withdraw(long amount) {
		getBalance();	
		if(amount<=balance) {
			balance -= amount;
		}else {		
			
//			System.out.print("잔액이 부족합니다. 다시 입력하세요:");
		}
		
		return balance;
	}
	
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}

	public static void main(String[]args) {
		
		
		Account p1 = new Account();
		p1.setOwner("김사장");
		p1.setBalance(50000);	//초기값
		System.out.println("저축:"+p1.balance);
		
		p1.deposit(4000);		//저축 후 금액
		System.out.println("저축 후 남은 금액:"+p1.balance);

		p1.withdraw(10000);		//인출 후 금액
		System.out.println("인출 후 남은 금액:"+p1.balance);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
