package thread;

public class ThreadSleep extends Thread {

	//�������У����߳�ʵ���������У�
	public static void main(String[] args) throws InterruptedException {
		String name =Thread.currentThread().getName();//����
		long id =Thread.currentThread().getId();//id
		int pri = Thread.currentThread().getPriority();//���ȼ�
		System.out.println("��ǰ���е��߳���"+name+" id:"+id+" ���ȼ��� "+pri);
		Thread thread1 = new ThreadSleep();
		thread1.start();//�߳�1 ���У�
		Thread.currentThread();
		Thread thread2 = new ThreadSleep();
		thread2.start();//�߳�2 ���У� 
		

	}

	//run����������߳���Ҫ���񣡴��100���ڵ�ż����
	public void run() {
		String name = Thread.currentThread().getName();
		
		for(int i=0;i<=100;i++){
			System.out.println(name +" for");
			if(i%2==0){
				System.out.println(name+" thread run:" +i);
				System.out.println(name +" sleep");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//˯��1��
				System.out.println(name +" up");
			}
		}
	}
}
