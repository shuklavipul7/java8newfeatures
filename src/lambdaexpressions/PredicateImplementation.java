package lambdaexpressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateImplementation {

	public static void main(String[] args) {
		Predicate<Collection> predicate = i -> i.isEmpty();
		List<String>list = new ArrayList<>();
		list.add("a");
		System.out.println(predicate.test(list));
	}

}
