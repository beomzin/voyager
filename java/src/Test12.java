
public class Test12 {

	public static void main(String[] args) {
		float f = 3.1415f;

		System.out.println(Math.ceil(f)); // 올림
		System.out.println(Math.floor(f)); // 버림
		System.out.println(Math.round(f)); // 반올림

		int a = -11;
		System.out.println(Math.abs(a));

		System.out.println(Math.random());
		System.out.println((int) Math.floor(Math.random() * 10) + 1);

		// 로또번호 5번 출력
		// 로또 1번 = 1 ~ 45번 중 중복없이 6개 숫자
		int[] lotto = new int[7];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) Math.floor(Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

//		if (list.indexOf(num) < 0) {
//			list.add(num);
//		} else {
//			i--;
//		}

		for (int i : lotto) {
			System.out.print(i + "\t");
		}

	}

}
