
public class Test03 {

	public static void main(String[] args) {
		int a = 0;

		if (a > 0) {
			System.out.println("a는 0보다 큽니다.");
		} else if (a == 0) {
			System.out.println("a는 0입니다.");
		} else {
			System.out.println("a는 0보다 작습니다.");
		}
		System.out.println("-끝-");
		int score = 100;

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
