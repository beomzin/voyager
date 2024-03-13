
public class Test08 {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 9 };

		System.out.println(arr[0]);
		System.out.println(arr.length);

		arr[0] = 2;
		System.out.println(arr[0]);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i : arr) {
			System.out.println(i);
		}

		int[][] arr2 = { { 2, 4, 6 }, { 3, 6, 9 } };

		System.out.println(arr2[0][1]);

		System.out.println(arr2.length);

		System.out.println(arr2[0].length);

//		if (a[0] > a[1]) {
//			temp1 = a[0];
//			a[0] = a[1];
//			a[1] = temp1;
//		}
//		if (a[0] > a[2]) {
//			temp1 = a[0];
//			a[0] = a[2];
//			a[2] = temp1;
//		}
//		if (a[1] > a[2]) {
//			temp1 = a[1];
//			a[1] = a[2];
//			a[2] = temp1;
//		}
//
//		for (int i : a) {
//			System.out.print(i + "\t");
//
//		}
//		System.out.println();

		// for문
		int[] a = { 9, 7, 3, 60, 23, 123, 66, 22, 49 };
		int temp1;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				System.out.println("i : " + i + " j : " + j);
				if (a[j] < a[i]) {
					temp1 = a[j];
					a[j] = a[i];
					a[i] = temp1;
				}
			}
		}

//		Arrays.sort(a);

		for (int i : a) {
			System.out.print(i + "\t");

		}
		System.out.println();
	}

}
