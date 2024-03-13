package com.java.test.svc;

public class SingletonTest {
	// 공유 객체 변수 생성
	private static SingletonTest instance;

	// 객체 취득용, 생성용 메소드
	public static SingletonTest getInstance() {
		// 객체 존재 여부 확인
		if (instance == null) { // 없으면..
			instance = new SingletonTest();
		}
		// 객체 주소 반환
		return instance;
	}

	// 변수, 메소드 생성
	public void test() {
		System.out.println("공유메소드");
	}
}
