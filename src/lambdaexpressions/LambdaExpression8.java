package lambdaexpressions;
/*In this example we will see how to implement two interfaces with the same default methods*/

interface Left{
	public default void m1(){
		System.out.println("Left");
	}
}

interface Right{
	public default void m1(){
		System.out.println("Right");
	}
}

public class LambdaExpression8 implements Left, Right{
	public void m1(){
		Left.super.m1();
	}

	public static void main(String[] args) {
		LambdaExpression8 l = new LambdaExpression8();
		l.m1();
	}

}
