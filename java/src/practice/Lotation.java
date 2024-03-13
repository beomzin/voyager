package practice;

import java.util.Scanner;

public class Lotation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int temp;
		for (int i = 0; i < n; i++) {
			temp = arr[0];
			for (int j = 0; j < n; j++) {

				if (j > 0 && j < n) {
					arr[j - 1] = arr[j];
				}
				System.out.print(arr[j] + " ");

			}

			arr[n - 1] = temp;
			System.out.println();

		}

	}
}
