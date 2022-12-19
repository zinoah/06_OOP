package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private SnackController scr = new SnackController();

	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("맛 : ");
		String plavor = sc.nextLine();
		
		System.out.print("개수 : ");
		int count = sc.nextInt();
		sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.println(scr.saveData(kind, name, plavor , count, price));
		
		
		System.out.println("저장한 정보를 확인하시겠습니까?(y/n) : ");
		String result = sc.next();
		
		if(result.equals("y")) {
			System.out.println(scr.confirmData());
		}
		
	}
}
