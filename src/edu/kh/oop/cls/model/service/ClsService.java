package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;

public class ClsService {
	// 클래스 접근제한자 확인하기
	public void ex1() {
		Student std = new Student();
		
		// public class인 Student는 import가능
		
		
		//TestVo text = new TestVo();
		//(default) class인 TestVo는 import 불가 (다른패키지여서)
		
		System.out.println(std.v1);
		//다른 패키지에서도 접근 가능한 public만 에러가 없다
	}
	
	public void ex2() {
		//static 필드 확인 예제 
		
		//학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
		
		System.out.println(std1.schoolName);
		//public 이기 때문에 직접 접근 가능
		//System.out.println(std1.name);
		
		System.out.println("변경 전 : " + std1.getName());
		std1.setName("최진호");
		System.out.println("변경 후 : " + std1.getName());
		//std1.setName("최진호");
		
		System.out.println(std2.schoolName);
		//public 이기 때문에 직접 접근 가능
		
		System.out.println("변경 전 : " + std1.schoolName);
		std1.schoolName = "고등학교";
		System.out.println("변경 후 : " + std1.schoolName); //schoolName은 private가 아니라 직접접근가능.
		
		// schoolName에 노란줄이 뜨는 이유! -> 제대로 작성 안해서 
		
		// *** static이 붙은 필드(변수)는
		// 클래스명.변수명 으로 사용함.
		
		Student.schoolName = "kh";
		System.out.println("Student.schoolName : " + Student.schoolName);
		
		/*
		 * static
		 * 
		 * 1) 공유 메모리 영역( 또는 정적 메모리 영역) 이라고 함.
		 * 
		 * -> 프로그램 시작 시 static이 붙은 코드들이 
		 * 모두 static 영역에 생성되고,
		 * 프로그램이 종료될 때 까지 사라지지 않음 . (정적)
		 * 그리고 static 영역에 생성된 변수는 어디서든 공유가능(공유)
		 * 
		 * 
		 * 2) 사용 법 : 클래스명.변수명
		 * 
		 * 
		 * */
		
		
		
		
		
	}
}
