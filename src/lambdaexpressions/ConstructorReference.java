package lambdaexpressions;
/*
 * This class shows how to use constructor reference
 * It is used to provide implementation for interfaces whose method returns an object type
 * Basically we call the constructor of the object to be created*
 */

class Employee{
	public void printHello(){
		System.out.println("Hello World!!");
	}
}

@FunctionalInterface
interface InterfEmployee{
	public Employee getEmployee();
}

public class ConstructorReference {

	public static void main(String[] args) {
		InterfEmployee i = Employee::new;
		Employee e = i.getEmployee();
		e.printHello();
	}

}
