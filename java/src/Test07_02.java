
public class Test07_02 {

	public static void main(String[] args) {
//		1 + 0 = 1
//				a + b = sum
//		0 + 1 = 1
//				a + b = sum
//		1 + 1 = 2
//				a + b = sum
//				b + sum = sum*
//				a = b, b = sum,
//				sum = a + b (= sum*) - 반복!
//		1 + 2 = 3
//		2 + 3 = 5
//		3 + 5 = 8

		int a = 1;
		int b = 0;
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			sum = a + b;
			a = b;
			b = sum;

			System.out.println(sum);
		}

	}

}
