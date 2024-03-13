package practice;

public class Test99 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				sum = i * j;
				if (i % 2 == 0) {
					System.out.println(i + "X" + j + "=" + sum);
				}
			}
		}
	}

}
