package lambdaexpressions;
interface Test{
	public void name();
}

class TestImpl{
	int x=9;
	public void demo() {
		int y=10;
		Test test = () -> {
							x=888;
							System.out.println(x);
							System.out.println(y);
						  };
		test.name();
	}
}

public class LambdaExpressions7{
	public static void main(String[] args) {
		TestImpl testImpl = new TestImpl();
		testImpl.demo();
	}
}

