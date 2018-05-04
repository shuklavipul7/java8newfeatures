package lambdaexpressions;

@FunctionalInterface
interface SquareIt{
	public int findSquare(int x);
}

public class LambdaExpressions4 {

	public static void main(String[] args) {
		SquareIt i = x -> x*x;
		System.out.println(i.findSquare(4));
	}

}
