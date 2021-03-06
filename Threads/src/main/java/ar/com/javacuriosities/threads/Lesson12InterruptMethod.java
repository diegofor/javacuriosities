package ar.com.javacuriosities.threads;


public class Lesson12InterruptMethod {

	public static void main(String[] args) {
		Runnable heavyTask = new Task();
		Thread thread = new Thread(heavyTask);
		thread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// Log and Handle exception
			e.printStackTrace();
		}
		System.out.println("Main Thread interrupting another Thread");
		thread.interrupt();
		System.out.println("Finishing Main");
	}

	private static final class Task implements Runnable {
		@Override
		public void run() {
			try {
				System.out.println("Before running - work()");
				work();
				System.out.println("After running -  work()");
			} catch (InterruptedException e) {
				// Log and Handle exception
				// e.printStackTrace();
				System.out.println("work() Method has been interrupted");
				return;
			}
			System.out.println("Finishing run()");
		}

		public void work() throws InterruptedException {
			while (true) {
				Thread.sleep(2000);
			}
		}
	}
}