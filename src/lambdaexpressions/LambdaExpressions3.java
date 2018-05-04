package lambdaexpressions;
@FunctionalInterface
interface InterfaceEx{
	public int findLength(String s);
}

public class LambdaExpressions3 {
	public static void main(String[] args) {
		InterfaceEx interfaceEx = s -> s.length();
		System.out.println("Length of string is: "+interfaceEx.findLength("Hello"));
	}
}
