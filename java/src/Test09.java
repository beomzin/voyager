
public class Test09 {

	public static void main(String[] args) {
//		 new : 객체 생성 시점
//		 생성자 : 클래스명과 동일함. 초기 구동.
		Test09s ts = new Test09s("안녕?");
		System.out.println(ts); // 주소 => Test09s@26f0a63f
		System.out.println(ts.s); // ts주소에 있는 s객체 .=> ~에 있는
//		System.out.println(ts.p);  접근권한 private - 접근 불가  

		String a = "abc";
		System.out.println(a.hashCode()); // a객체의 주소

		Test09s ts2 = new Test09s();
		System.out.println(ts2); // => Test09s@4926097b

		ts.s = "1번";
		System.out.println(ts.s); // ts와 ts2의 객체는 다르다
		System.out.println(ts2.s);

		ts2 = ts; // 상호 참조 - 남아있는 기존 ts2 주소는 GC(garbage collector)에 의해 제거
		System.out.println(ts2.s);
		System.out.println(ts2); // => Test09s@26f0a63f

		ts.test();

		int b = ts.add(1, 2);
		System.out.println(b);

		int c = ts.sub(2, 1);
		System.out.println(c);

		int d = ts.mul(3, 2);
		System.out.println(d);

		int e = ts.div(6, 2);
		System.out.println(e);

		ts.printAdd(1, 2);
//		구구단
		ts.gugu(7);
//		가장 가까운 수 
		ts.nearNum(21);
	}

}
