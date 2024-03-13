package com.java.test.ctrl;

import java.util.Scanner;

public class TestCtrl3 {

	public static void main(String[] args) {
		// Scanner : 입력을 지원하는 클래스
		// Scanner 변수명 = new 생성자(입력객체);
		// System.in : Java를 통해서 데이터를 입력받는 객체
		Scanner sc = new Scanner(System.in);

		// nextLine() : 입력대기상태에 있다가 엔터가 입력되면 엔터 직전까지 취득
		String s = sc.nextLine();
		System.out.println(s);

		int a = sc.nextInt();
		System.out.println(a);

		String s2 = sc.next();
		System.out.println(s2);

		sc.nextLine(); // 남은 엔터 처리
		s = sc.nextLine();
		System.out.println(s);

	}

}
