
public class Test10C extends Test10P {
	public String s = "Child!!!";

	public void test() {
		System.out.println("C에서 부름 : " + s);
	}

	public void test2() {
		// super : 부모클래스
		System.out.println("부모꺼 호출 : " + super.s);
	}

	public void p() {
		System.out.println("갈아엎음");
	}

}
