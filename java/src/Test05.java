
public class Test05 {

	public static void main(String[] args) {
		int a = 1;

		switch (a) {
		case 1:
			System.out.println("1이다.");
			break;
		case 3:
			System.out.println("3이다.");
			break;

		default:
			System.out.println("1도 3도 아니다.");
		}

		int score = 94;

		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}

	}

}
