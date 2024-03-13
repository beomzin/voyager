
public class Test04 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 2;
		int d;

//		오름차순 정렬 구현, 각 초기값이 변경되어도 정렬이 가능해야 함.
//		a < b < c

		if (a > b) {
			d = a;
			a = b;
			b = d;
		}
		if (a > c) {
			d = a;
			a = c;
			c = d;
		}
		if (b > c) {
			d = b;
			b = c;
			c = d;
		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
