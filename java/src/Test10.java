
public class Test10 {

	public static void main(String[] args) {
		Test10C c = new Test10C();

		c.test();

		System.out.println(c.s);

		c.test2();

		c.p();

		Test10P p2 = new Test10C();
//		Test10C c2 = new Test10P();

		p2.p();
	}

}
