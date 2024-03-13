package com.java.test.ctrl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.java.test.bean.TestBean;
import com.java.test.svc.TestSvc2;

public class TestCtrl2 {

	public static void main(String[] args) {
		TestBean tb = new TestBean();

		tb.setNo(1);
		tb.setId("Test");
		tb.setPw("1234");

		System.out.println(tb.getNo() + "\t" + tb.getId());

		try {
			Integer.parseInt("abc");
			Integer.parseInt("123");

			// throw : 뒤에 지정된 예외객체를 강제 발생
			throw new ArrayIndexOutOfBoundsException();
		} catch (NumberFormatException ne) {
			ne.printStackTrace();
		} catch (Exception e) {
			// printStackTrace() : 시스템에 현제 발생한 예외 출력을 요청
			e.printStackTrace();

			// toString() : 발생한 예외내용을 취득
			System.out.println("==>" + e.toString());
		}

		System.out.println("try ~ catch이후 실행");

		TestSvc2 ts2 = new TestSvc2();

		try {
			ts2.test();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		for (int i = 10; i > 0; i--) {
			HashMap<String, String> data = new HashMap<String, String>();

			data.put("NO", Integer.toString(i));
			data.put("TITLE", "Test" + i);
			data.put("WRITER", "Tester");

			list.add(data);
		}

		for (HashMap<String, String> data : list) {
			System.out.println(data.get("NO") + "\t" + data.get("TITLE") + "\t" + data.get("WRITER"));
		}

		System.out.println("----------------------");
		// 오름차순으로 정렬
		HashMap<String, String> temp;
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				int num1 = Integer.parseInt(list.get(i).get("NO")); // list.get() == data
				int num2 = Integer.parseInt(list.get(j).get("NO"));
				if (num1 > num2) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}

		for (HashMap<String, String> data : list) {
			System.out.println(data.get("NO") + "\t" + data.get("TITLE") + "\t" + data.get("WRITER"));
		}

	}

}
