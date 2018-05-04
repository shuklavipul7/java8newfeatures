package lambdaexpressions;
import java.util.function.Function;

//This class is an example of how to implement Function interface
public class FunctionImplementation {

	public static void main(String[] args) {
		
		//This implementation of Function takes in a String and returns the length of String
		Function<String, Integer>function = s->s.length();
		
		int n = function.apply("Hello");//Returns 5
		System.out.println(n);

	}

}
