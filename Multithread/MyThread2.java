package multithreading;

public class MyThread2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread2 thMyThread = new MyThread2();
		Thread thread1 = new Thread(thMyThread);
		thread1.setName("Thread1");
		thread1.start();
		
		Thread thread2 = new Thread(thMyThread);
		thread2.setName("Thread2");
		thread2.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("executing thread :"+Thread.currentThread().getName());
		}
		
	}

}
