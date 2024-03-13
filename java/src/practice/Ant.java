package practice;

public class Ant {

	public static void main(String[] args) {
		String ant = "1"; // 12
//		System.out.println(ant.charAt(1));
		for (int row = 0; row < 3; row++) {
			int num = Integer.parseInt(ant); // 1
			int cnt = 1;
			int val = 1;
			String res = "";

			for (int j = 0; j < ant.length(); j++) {
				val = num % 10; // 2
				int a = Character.getNumericValue(ant.charAt(j)); // 2== 2 true
				if (val == a) {
					cnt++; // 2
				} else {
					res = (10 * val + cnt) + res; // 20 + 2 + ""
					val = a; // 1
					cnt = 1; // 1
				}
			}

			res = (10 * val + cnt) + res;// + 2 + ""

			ant = res;
			System.out.println(ant); // 12
		}

	}

}
