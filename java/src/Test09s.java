
public class Test09s {
	public String s = "Hi!";

	private String p = "Oh!";

	public Test09s() {
		System.out.println("기본 생성자 실행");
	}

	public Test09s(String msg) {
		System.out.println(p + " : " + msg);
	}

	public void test() {
		System.out.println("test메소드 실행");
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public void printAdd(int a, int b) {
		System.out.println(a + b);
	}

//	구구단
	public void gugu(int a) {
		for (int i = 1; i < 10; i++) {
			System.out.println(a + " X " + i + " = " + a * i);
		}
	}

//	가장 가까운 수
	public void nearNum(int num) {
		int[] arr = { 45, 17, 22, 1, 98 };
		int min = arr[0];
		int cha = cha(num, min);

		for (int i = 1; i < arr.length; i++) {
			if (cha > cha(num, arr[i])) {
				min = arr[i];
				cha = cha(num, arr[i]);
			}
		}
		System.out.println(min);

	}

//	차이의 절대값을 돌려주는 메소드
	public int cha(int a, int b) {
		int cha = a - b;

		if (cha < 0) {
			cha *= -1;
		}

		return cha;
	}
}
