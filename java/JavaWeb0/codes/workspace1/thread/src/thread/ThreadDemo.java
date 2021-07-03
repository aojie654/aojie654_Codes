package thread;
//����2 ͨ���̳�Thread�ࡣ����run����ʵ���̣߳�
public class ThreadDemo extends Thread{

	//run����������߳���Ҫ���񣡴��100���ڵ�ż����
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=0;i<=100;i++){
			if(i%2==0){
				System.out.println(name+" thread run:" +i);
			}
		}
	}
	//�������У����߳�ʵ���������У�
	public static void main(String[] args) throws InterruptedException {
		String name =Thread.currentThread().getName();//����
		long id =Thread.currentThread().getId();//id
		int pri = Thread.currentThread().getPriority();//���ȼ�
		System.out.println("��ǰ���е��߳���"+name+" id:"+id+" ���ȼ��� "+pri);
		Thread thread1 = new ThreadDemo();
		thread1.setName("�߳�1");
		thread1.setPriority(1);//���ȼ����10 ��С1 
		thread1.start();//�߳�1 ���У�
		Thread.sleep(1000);
		///thread1.sleep(5000);//˯��0.1�롣�����ݣ�
		Thread thread2 = new ThreadDemo();
		thread2.setName("�߳�2");
		thread2.start();//�߳�2 ���У�
		//thread2.start();//�߳�2 ���У�
	}
}
