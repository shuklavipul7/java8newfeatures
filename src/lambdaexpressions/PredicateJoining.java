package lambdaexpressions;
import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		Predicate<Integer>p1 = i -> i>10;//This predicate checks if the number is greater than 10
		Predicate<Integer>p2 = i -> i%2==0;//This predicate checks if the number is even
		
		System.out.println(p1.test(100));//Returns true
		System.out.println(p2.test(13));//Returns false
		
		//Predicate Joining
		Predicate<Integer>p3 = p1.negate();//This is negate of p1 and checks if number is less than 10
		Predicate<Integer>p4 = p1.and(p2);//This predicate checks if number is greater than 10 and it is even
		Predicate<Integer>p5 = p1.or(p2);//This predicate checks if p1 is greater than 10 or it is even
		
		System.out.println(p3.test(100));//Returns false (number should be less than 10)
		System.out.println(p4.test(2));//Returns false (number should be greater than 10 and even)
		System.out.println(p5.test(2));//Returns true (number should be greater than 10 or even)

	}

}
