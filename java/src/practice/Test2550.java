package practice;

public class Test2550 {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 9, 3, 5 };
		int temp;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] > arr[i]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for (int i : arr) {
			System.out.print(i + "\t");

		}
	}

}
