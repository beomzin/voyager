package com.java.test.svc;

public class TestSvc2 {
	// throws : 예외가 발생할 수도 있는 상태. 안전장치. 복수 지정 가능. ,로 구분
	// 메소드 사용처에 문제가 발생할 수도 있음을 알림.
	// 사용 : 외부 접속이나 인자로 받아서 처리하는 부분에 예외가 생길 수 있는 경우
	public void test() throws Throwable {
		System.out.println("test메소드");
	}

	public void printS() {
		System.out.println(TestSvc4.s);
	}

	// final은 접근권한 뒤에 존재
	public final String msg = "final 변수";
}
