package lambdaexpressions;

interface InterfaceExample{
	public void helloWorld();
}


public class LambdaExpressions {
	public static void main(String[] args) {
		InterfaceExample interfaceExample = () -> System.out.println("Hello World");
		interfaceExample.helloWorld();
	}
}
