package com.java.test.ctrl;

import java.util.Calendar;

import com.java.test.svc.SingletonTest;
import com.java.test.svc.TestSvc2;
import com.java.test.svc.TestSvc4;

public class TestCtrl4 {

	public static void main(String[] args) {
		// static활용 시 : 클래스명.변수명 or 클래스명.메소드명
		System.out.println(TestSvc4.s);

		TestSvc4.s = "Hello";
		// 이후 해당 변수 사용시 Hello로 적용. 다른 클래스에서도 동일하게 적용
		System.out.println(TestSvc4.s);

		TestSvc2 ts2 = new TestSvc2();

		ts2.printS();

//		ts2.msg = "Hi";

//		TestSvc4.MSG = "AAAAAAA";

		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(1));

		SingletonTest st = SingletonTest.getInstance();

		st.test();

	}

}
