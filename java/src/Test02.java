
public class Test02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 7;

//		사칙연산
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

//		비교연산 -> boolean 타입 출력
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);

// 		한줄주석 : ctrl + /

		/*
		 * 여러줄 주석
		 */

		/**
		 * 정보주석
		 */

//		증감연산
		a += b; // 10 + 7
		System.out.println(a);

		a -= b; // 17 - 7
		System.out.println(a);

		a *= b; // 10 * 7
		System.out.println(a);

		a /= b; // 70 / 10
		System.out.println(a);

		a %= b; // 10 % 7
		System.out.println(a);

//		1증가
		System.out.println(++a); // 4
		System.out.println(a); // 4

		System.out.println(a++); // 4
//		1증가
		System.out.println(a); // 5

		System.out.println(a > 5);
		System.out.println(a <= 7);
		System.out.println(a > 5 && a <= 7); // false && true => true

		System.out.println(a <= 5);
		System.out.println(a > 7);
		System.out.println(a <= 5 || a > 7); // true || false => true

//		문자열 + 숫자 : 문자열 (문자열은 + 밖에 안됨)
		System.out.println("문자열" + 1); // "문자열1"
		System.out.println("문자열" + (1 - 2)); // "문자열" + -1 = "문자열-1"

//		 int a = 10;
//		 int b = 20;
//		 String c = 30;
//		 
//		 System.out.println(a + b + c); = 3030
//		 System.out.println(c + b + a); = 302010	 

//		변수의 형변형
		System.out.println((float) 7);
		System.out.println((int) 3.14);

//		 int -> Integer
//		 long -> Long
//		 float -> Float
//		 double -> Double

		System.out.println(Integer.toString(1) + 2 + 3); // 123
//		 System.out.println(Integer.toString(1 + 2) + 3); = 33
		System.out.println(Integer.parseInt("1") + 2 + 3); // 6
//		 System.out.println(Integer.parseInt("ABC") + 2 + 3); => 문법적으로는 문제가 없으나 오류가 발생한다.
	}

}