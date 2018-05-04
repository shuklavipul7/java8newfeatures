package lambdaexpressions;

interface ExampleInterface{
	public void sum(int a, int b);
}

public class LambdaExpressions2 {
	public static void main(String[] args) {
		ExampleInterface exampleInterface = (a,b) -> System.out.println("Sum of "+a+", "+b+" is: "+(a+b));
		exampleInterface.sum(8, 15);
	}
}
