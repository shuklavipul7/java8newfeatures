package lambdaexpressions;
import java.util.function.Supplier;

public class SupplierImplementation {

	public static void main(String[] args) {
		Supplier<String>supplier = ()-> {
											String[]arr = {"a", "b", "c", "d"};
											int i = (int)(Math.random()*3+1);
											return arr[i];
										};
		System.out.println(supplier.get());

	}

}
