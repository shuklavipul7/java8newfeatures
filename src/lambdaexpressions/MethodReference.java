package lambdaexpressions;
//This method shows, how to use method reference using a static method

@FunctionalInterface
interface Interf{
	public void m1();
}

public class MethodReference {
	
	public static void m2(){
		System.out.println("Method Reference using static method");
	}
	
	public void m3(){
		System.out.println("Method Reference using instance method");
	}
	
	//This shows that return type can change while using method reference
	public String m4(){
		System.out.println("This shows that return type can change while using method reference");
		return "Method Reference using instance method and returning string";
	}

	public static void main(String[] args) {
		/*Method Reference in action
		 * The only requirement is that the arguments of the method to be implemented and the implementing method must match*/
		
		Interf i  = MethodReference::m2;//Class name is used since the method is static
		i.m1();
		
		MethodReference m = new MethodReference();
		
		Interf i2 = m::m3; //Object is used to call an instance method in method reference
		i2.m1();
		
		Interf i3 = m::m4; //Object is used to call an instance method in method reference
		i3.m1();
	}

}
