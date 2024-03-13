import java.io.IOException;

public class Test06 {

	public static void main(String[] args) throws IOException {
//		int a = 1; // 초기값
//
//		while (a <= 10) {
//			System.out.println(a);
//			a++; // 증감값
//		}
//
//		while (true) {
//			System.out.println("loop : " + a);
//			a++; // 증감값
//
//			if (a == 100) { // 조건
//				break;
//			}
//		}
//
//		do {
//			System.out.println(a);
//			a++;
//		} while (a <= 10);
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//
//		// 1부터 100 까지의 3배수들의 합계를 출력하시오
//		int j;
//		int sum = 0;
//
//		for (j = 0; j <= 100; j++) {
//			if (j % 3 == 0) {
//				sum += j;
//			}
//		}
//		System.out.println(sum);
//
//		sum = 0;
//		for (j = 1; 3 * j <= 100; j++) {
//			sum += 3 * j;
//		}
//		System.out.println(sum);
//
//		sum = 0;
//		for (j = 0; j <= 100; j += 3) {
//			sum += j;
//		}
//		System.out.println(sum);
//		int i;
//		int j;
//
//		for (i = 2; i <= 100; i++) {
//			for (j = i - 1; j < i; j++) {
//				if (i != j && i % j == 0) {
//					
//				}
//			}
//		}

//		for (int i = 2; i <= 100; i++) {
//			int cnt = 0;
//			for (int j = 2; j < i; j++) {
//				if (i % j == 0) {
//					cnt++;
//				}
//			}
//			if (cnt == 0) {
//				System.out.println(i);
//			}
//		}
		int num = 100;

		for (int i = 1; i <= num; i++) {
			for (int j = 2; j <= i; j++) {
				if (i != j && i % j == 0) { // i 는 j가 아니고 i를 j로 나눴을때의 나머지가 0이면 없애줘
//					System.out.println(i + "%" + j + " == 0 break;");
					break;
				}
				if (i == j) {
					System.out.println(i);
				}
			}
		}

		System.out.println("<--pt---------");

		num = 24;

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				num /= i;

				System.out.println(i);
				i--;
			}
		}
	}
}
