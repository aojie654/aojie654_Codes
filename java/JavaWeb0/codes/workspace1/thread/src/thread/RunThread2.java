package thread;
//方法1 。实现Runnable接口
public class RunThread2 implements Runnable{
	
	//定义好一个线程后，让线程运行起来！
	public static void main(String[] args) {
		//定义一个线程！Thread类的实例，
		//将实现了Runnable接口的本类实例作为参数传入！
		Thread thread1 = new Thread(new RunThread2());//定义线程1
		thread1.start();//活了！执行run方法！能够作为线程自己运行了！
		Thread thread2= new Thread(new RunThread2());//定义线程2
		thread2.start();
		for(int i=0;i<100;i++){
			System.out.println("Main method :"+ i);
		}
	}

	@Override
	public void run() {
	//线程的工作任务全在run方法中！
		//计算1+2+3加到100
		String name =Thread.currentThread().getName();
		long id = Thread.currentThread().getId();
		int sum =0;
		for(int i=1;i<=100;i++){
			sum = sum+i;
			System.out.println(id+" "+name+" thread run: sum"+i+"="+sum);

		}
	}

}
