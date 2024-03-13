
public class Test07_01 {

	public static void main(String[] args) {
		// 6번
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				if (j >= 4 - i && j <= 4 + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("--------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 1 + (2 * i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("--------------");
		// 7번
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				if (j >= i && j < 9 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("--------------");
		// 8번
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j >= 4 - i && j <= 4 + i && j >= i - 4 && j <= 12 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
