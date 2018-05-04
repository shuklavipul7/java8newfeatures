package lambdaexpressions;

public class LambdaExpressions6 {

	public static void main(String[] args) {
		//Here we are passing the runnable as an argument to the thread class
		Thread thread = new Thread(() -> {
			for(int i=0; i<10; i++){
				System.out.println("Inside Thread class");
			}
		});
		thread.start();
		
		for(int i=0; i<10; i++){
			System.out.println("Inside Main class");
		}
	}

}
