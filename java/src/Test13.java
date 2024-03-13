
public class Test13 {

	public static void main(String[] args) {
		String s = "Hello, World!!";
		String s2 = "      HaHa      !!      ";
		String s3 = "사과, 배, 감";

		System.out.println(s.concat("!!"));
//		System.out.println(s + "!!");

//		substring(숫자) : 숫자인덱스 이상을 가져온다.
//		substring(숫자1, 숫자2) : 숫자1 인덱스 이상, 숫자2 인덱스 미만의 범위를 가져온다
		System.out.println(s.substring(7));
		System.out.println(s.substring(7, 12));

//		length() : 문자열 길이
		System.out.println(s.length());

//		replace(값1, 값2) : 값 1들을 찾아서 값 2로 변경
//		replaceAll(값1, 값2) : 값 1들을 찾아서 값 2로 변경
//		replaceFirst(값1, 값2) : 값 1을 찾아서 값 2로 변경
		System.out.println(s.replace("H", "Y"));
		System.out.println(s.replaceAll("l", "k"));
		System.out.println(s.replaceFirst("l", "k"));

//		indexOf(값) : 앞에서부터 값의 위치를 찾는다.
//		indexOf(값, 숫자) : 숫자인덱스 이상에서 값의 위치를 찾는다.
		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("l", 4));

//		lastIndexOf(값) : 뒤에서부터 값의 위치를 찾는다.
//		lastIndexOf(값, 숫자) : 숫자인덱스 이하에서 값의 위치를 찾는다.
		System.out.println(s.lastIndexOf("l"));
		System.out.println(s.lastIndexOf("l", 4));

//		toUpperCase() : 모두 대문자로
//		toLowerCase() : 모두 소문자로
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

//		trim() : 앞뒤 공백 제거
		System.out.println(s2);
		System.out.println(s2.trim());

//		split(값) : 값이 일치하는 곳을 기준으로 문자열을 자르고 배열로 변환
		String[] temp = s3.split(",");
		System.out.println(temp[0]);
		System.out.println(temp.length);

//		charAt(인덱스번호) : 인덱스번호의 값을 문자형태로 취득
		for (int i = 0; i < s.length(); i++) {
			System.out.println(i + " : " + s.charAt(i));
		}

//		equals(값) : 값과 문자열이 같은지 비교
		System.out.println(s.equals("Hello, World!!"));
		String[] a = { "Hello,", " World!!" };
		System.out.println(s == a[0] + a[1]); // == 은 주소비교
		System.out.println(s.equals(a[0] + a[1])); // equals는 값을 꺼내서 비교

	}
}
