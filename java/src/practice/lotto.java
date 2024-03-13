package practice;

import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] lotto = new int[6];
		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) Math.floor(Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		for (int i : lotto) {
			System.out.print(i + " ");
		}

		int bonus = (int) Math.floor(Math.random() * 45) + 1;
		System.out.println(bonus);

		int cnt = 0;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (lotto[i] == num[j]) {
					cnt++;
				}
				if (bonus == num[j] && cnt == 5) {
					cnt = 10;
				}
			}
		}
		switch (cnt) {
		case 10:
			System.out.println("2등");
			break;
		case 3:
			System.out.println("5등");
			break;
		case 4:
			System.out.println("4등");
			break;
		case 5:
			System.out.println("3등");
			break;
		case 6:
			System.out.println("1등");
			break;
		default:
			System.out.println("꽝");
			break;

		}

	}

}
