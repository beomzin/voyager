package com.java.test.ctrl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// import : 파일의 위치를 지정함. 특정 파일이 아닌 경로 안에 있는 모든것을 지정할 경우
//			경로. * 로 표기
// import 자동완성 단축키 : ctrl + shift + o(영어)
import com.java.test.svc.TestSvc1;

public class TestCtrl1 {

	public static void main(String[] args) {
		TestSvc1 ts = new TestSvc1();

		List<String> list = new ArrayList<String>();

		// add(값) : 리스트에 값 추가
		list.add("ABC");
		list.add("DEF");
		// add(인덱스번호, 값) : 인덱스번호 위치에 값 추가, 기존 값은 번호 증가.
		list.add(1, "GHI");
		// size() : 리스트의 개수를 가져옴
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			// get(인덱스번호) : 인덱스번호의 값을 가져옴
			System.out.println(list.get(i));
		}

		for (String s : list) {
			System.out.println(s);
		}
		// set(인덱스번호, 값) : 인덱스번호위치의 값을 주어진 값으로 변경
		list.set(1, "가나다");

		for (String s : list) {
			System.out.println(s);
		}

		list.remove(2);

		for (String s : list) {
			System.out.println(s);
		}
		// isEmpty() : 비어있으면 true, 아니면 false
		System.out.println(list.isEmpty());
		// contains(값) : 리스트에 주어진 값과 일치한 값이 있는지 확인
		System.out.println(list.contains("가나다"));
		// indexOf(값) : 주어진 값과 일치하는 값의 위치를 지정
		System.out.println(list.indexOf("가나다"));
		// sort(null) : 오름차순 정렬
		list.sort(null);
		// toString() : 출력가능한 값을 문자열의 형태로 취득
		System.out.println(list.toString());

		// toArray() : 리스트를 배열로 변환, 형변환이 필요함.
		// String[] temp = (String[]) list.toArray();

		System.out.println("----------------------");

		List<Integer> num = new ArrayList<Integer>();

		// [25 , 7, 3]
		num.add(25);
		num.add(7);
		num.add(3);

//		int temp;
//
//		for (int i = 0; i < num.size() - 1; i++) {
//			for (int j = i + 1; j < num.size(); j++) {
//				if (num.get(i) > num.get(j)) {
//					temp = num.get(i);
//					num.set(i, num.get(j));
//					num.set(j, temp);
//				}
//			}
//		}

//		for (int i = 0; i < num.size() - 1; i++) {
//			for (int j = i + 1; j < num.size(); j++) {
//				if (num.get(i) > num.get(j)) {
//					num.add(i, num.get(j));
//					num.remove(j + 1);
//				}
//			}
//		}

		for (int i = 0; i < num.size() - 1; i++) {
			for (int j = i + 1; j < num.size(); j++) {
				if (num.get(i) > num.get(j)) {
					num.add(num.get(i));
					num.remove(i);
					i--;
					break;
				}
			}
		}
		System.out.println(num.toString());

		Map<Integer, String> map = new HashMap<Integer, String>();

		// put(값1, 값2) : 값1인 키에 값2를 넣는다
		map.put(1, "가나다");
		map.put(2, "라마바");
		map.put(3, "사아자");

		// get(값) : 키중에 값과 같은 것의 내용을 가져온다
		System.out.println(map.get(3));

		// size() : 맵에 들어있는 개수를 돌려줌
		// isEmpty() : 비어있는지 확인

		// containsKey(값) : 값과 일치하는 키가 있는지 확인
		// containsValue(값) : 주어진 값과 일치하는 값이 맵에 존재하는지 확인
		System.out.println(map.containsKey(0));
		System.out.println(map.containsValue("사아자"));

		// remove(값) : 주어진 값과 일치하는 키의 데이터를 지움
		map.remove(1);
		System.out.println(map.get(1));
		// replace(값1, 값2) : 값1과 일치하는 키에 값2를 할당
		map.replace(2, "ABC");
		// map의 경우 put이 덮어씌우는 기능이 포함되어 있음
		map.put(2, "DEF");
		// clear() : map의 내용을 비운다
		map.clear();
		// keySet() : map의 키들을 Set으로 변환
		Set<Integer> keySet = map.keySet();

		// Set의 iterator() : Set의 값들을 Iterator형식으로 변환
		Iterator<Integer> keys = keySet.iterator();

		while (keys.hasNext()) {
			// Iterator의 next() : 현재가르키는 위치 다음 값을 가져오며, 핀이 이동
			System.out.println(map.get(keys.next()));
		}
		System.out.println("---------------");
		ts.s1("HELLO_WORLD_JAVA");
		System.out.println();
		ts.s2("HELLO_WORLD_JAVA");
	}

}
