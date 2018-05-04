package lambdaexpressions;
import java.util.function.Consumer;

public class ConsumerImplementation {

	public static void main(String[] args) {
		Consumer<String>consumer = s -> System.out.println(s);
		consumer.accept("Hello World!");
	}

}
