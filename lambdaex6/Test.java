package lambdaex6;

public class Test {
	int x = 10;

	public void m2() {
		int y = 20;
		Interf i = () -> {
			System.out.println(x);
			System.out.println(y);
			x = 88;
			// y=77;
		};
		i.m1();
		// y=99;
	}

	public static void main(String s[]) {
		Test t = new Test();
		t.m2();
	}

}
