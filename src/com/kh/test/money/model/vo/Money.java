package com.kh.test.money.model.vo;

public class Money {
	
	
	//필드
	
	public static final String UNIT = "원";
	
	private int money;
	
	
	
	//생성자
	
	public Money() {
		
	}
	
	public Money(int money) {
		this.money = money;
	}

	
	//메소드
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	public static String getUnit() {
		return UNIT;
	}
	
	
	
	public void print() {
		System.out.println(money + UNIT);
	}
}
