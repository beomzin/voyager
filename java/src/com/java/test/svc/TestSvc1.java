package com.java.test.svc;

public class TestSvc1 {

//	public String str = "HELLO_WORLD_JAVA";

	public String s1(String str) {

		String[] a = str.split("_");

		String res = a[0].toLowerCase();

		for (int i = 1; i < a.length; i++) {
			res += a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase();
		}
		System.out.print(res);
		return res;

	}

	public String s2(String str) {
		str = str.toLowerCase();

		while (str.indexOf("_") != -1) {
			int idx = str.indexOf("_");
			// _첫글자 = 대문자로 변경
			str = str.replace(str.substring(idx, idx + 2), str.substring(idx + 1, idx + 2).toUpperCase());
		}
		System.out.println(str);
		return str;
	}

}
