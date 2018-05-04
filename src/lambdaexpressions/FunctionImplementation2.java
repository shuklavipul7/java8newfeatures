package lambdaexpressions;
import java.util.function.Function;

//This class is an example of how to implement Function interface
public class FunctionImplementation2 {

	public static void main(String[] args) {
		Function<Integer, Integer>function = i -> i*i; //This function accepts a number and returns the square of that number
		int square = function.apply(5);
		System.out.println(square);

	}

}
