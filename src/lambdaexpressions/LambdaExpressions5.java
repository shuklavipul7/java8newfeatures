package lambdaexpressions;

public class LambdaExpressions5 {

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			for(int i=0;i<10;i++){
				System.out.println("Inside Child Thread");
				try{
					Thread.sleep(1000);
				}
				catch(InterruptedException e){}
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		for(int i=0; i<10; i++){
			System.out.println("Inside Main Thread");
			try{
				Thread.sleep(1200);
			}
			catch(InterruptedException e){}
		}
	}

}
